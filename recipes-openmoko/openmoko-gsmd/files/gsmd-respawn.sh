#!/usr/bin/env bash

NAME=`basename $1`
PIDFILE="/var/run/$NAME.pid"
PID=$$
echo "$PID" > $PIDFILE
echo "-1000" > /proc/$PID/oom_score_adj

trap "{ rm -f $PIDFILE ; kill 0; }" EXIT

while true;
do
	echo "Restarting not dealing well with spaces.."
	exec $* &
	LAST_PID=$!
	echo "0" > /proc/$LAST_PID/oom_score_adj
	wait $LAST_PID
	sleep 10s
done

