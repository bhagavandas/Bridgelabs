read -p "Enter X value :" x
read -p "Enter Y value :" y
read -p "1.Add 2.Sub 3.Mul 4.Div  " userInput
result=0
function arithmeticOperation(){
if [ $userInput==2 ]
then 
result=$((x-y))
echo "Result is : $result"
elif [ $userInput==3 ]
then
result=$((x*y))
echo "Result is : $result"
elif [ $userInput==4 ]
then
result=$((x/y))
echo "Result is : $result"
elif [ $userInput==1 ]
then
result=$((x+y))
echo "Result is : $result"
else
echo "Please check your Input, Its Invalid"
fi
}
arithmeticOperation