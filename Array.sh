Array=(10 20 20 10 10 20 5 20)
(IFS=$'\n'; sort <<< "${Array[*]}") | uniq -c

