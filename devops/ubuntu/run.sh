
if [ "$1" = "start" ] || [ "$1" = "up" ]
then
    vagrant up
elif [ $1 = "destroy" ]
then
    vagrant destroy
elif [ $1 = "provision" ]
then
    vagrant provision
fi