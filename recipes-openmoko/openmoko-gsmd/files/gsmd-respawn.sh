#!/usr/bin/env bash

NAME=`basename $1`
PIDFILE="/var/run/$NAME.pid"
PID=$$
echo "$PID" > $PIDFILE

trap "{ rm -f $PIDFILE ; kill 0; }" EXIT

while true;
do
	echo "Restarting not dealing well with spaces.."
	(exec $*) || true
	sleep 10s
done

