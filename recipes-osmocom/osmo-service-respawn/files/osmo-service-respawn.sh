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
        (echo "0" > /proc/self/oom_score_adj && exec $@) &
        LAST_PID=$!
        wait $LAST_PID
        sleep 10s
done

