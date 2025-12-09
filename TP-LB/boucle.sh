#"-s" mode silencieux = affiche la réponse simplifié 

count1=0
count2=0

for i in {1..500}; do
    a=$(curl -s localhost:83)

    if [ "$a" == "<h1>Hello 1</h1>" ]; then  ###compare la reponse du server local avec le server hello1
        ((count1++))
    elif [ "$a" == "<h1>Hello 2</h1>" ]; then
        ((count2++))
    fi
done

echo "Hello 1: $count1"
echo "Hello 2: $count2"

