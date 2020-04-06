#!/bin/sh
echo "开始停止应用："
pid=`ps -ef | grep lms-nav.jar | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]
then
#!kill -9 强制终止
   echo "kill -9 的pid:" $pid
   kill -9 $pid
fi
# 备份
file_path=/home/jonny/.jenkins/workspace/lmsnav-ci/target
mv /webroot/nav.lmsite.cn/lms-nav.jar /backups/lmsnav_bak/lmsnav.jar.`date +%Y%m%d%H%M%S`

echo `ls -A /webroot/nav.lmsite.cn/`

echo "复制新的 jar 包..."
cp /home/jonny/.jenkins/workspace/lmsnav-ci/target/lms-nav-0.9.0.jar /webroot/nav.lmsite.cn/lms-nav.jar

ehco "授予当前用户权限"
chmod 777 /webroot/nav.lmsite.cn/lms-nav.jar
echo "执行....."
cd /webroot/nav.lmsite.cn/
java -jar lms-nav.jar
echo "成功启动项目："
echo `ps -ef | grep lms-nav.jar`


