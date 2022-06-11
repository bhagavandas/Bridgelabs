read -p "Enter a value " a
read -p "Enter b value " b
read -p "Enter c value " c
read -p "1.A 2.B 3.C 4.D  " userinput
   result=0
function ArComp(){
if [ $userinput==1 ]
then
   result=$((a+b/c))
echo "Answer is : $result"
elif [ $userinput==2 ]
then
   result=$((a*b+c))
echo "Answer is : $result"
elif [ $userinput==3 ]
then
   result=$((c+a/b))
echo "Answer is : $result"
elif [ $userinput==4 ]
then
   result=$((a%b+c))
echo "Answer is : $result"

else [$userinput==5]
echo "Please check your input"
fi
}
ArComp
