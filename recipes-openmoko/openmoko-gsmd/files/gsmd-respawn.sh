#!/usr/bin/env bash

while true;
do
	echo "Restarting not dealing well with spaces.."
	(exec $*) || true
	sleep 10s
done

