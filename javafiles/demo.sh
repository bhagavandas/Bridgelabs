for item in 'ls *.java'
do
  nameOfFile = 'echo $item | awk -F.'{ print $1 }''
mkdir $nameOfFile
cp -r $item $nameOfFile  
done
