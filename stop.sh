#!/bin/sh
echo "停止 lms-nav  应用...."
pid=`ps -ef | grep lms-nav-0.9.0.jar | grep -v grep | awk '{print $2}'`
# shellcheck disable=SC1035
if ["$pid" == ""]
    then
        echo "lms-nav 已经停止了!"
else
    echo "lms-nav 的 pid 是:"+$pid
    kill -9 $pid
    echo "lms-nav 停止成功！"
fi
