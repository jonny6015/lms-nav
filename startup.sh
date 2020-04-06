#!/bin/sh
echo " 删除旧的 lms-nav-x.x.x.jar ..."
rm /webroot/nav.lmsite.cn/lms-nav-0.9.0.jar
cp $WORKSPACE/$project_name/target/lms-nav-0.9.0.jar /webroot/nav.lmsite.cn/lms-nav-0.9.0.jar
sleep 3s
echo "运行 lms-nav-x.x.x.jar...."
java -jar /webroot/nav.lmsite.cn/lms-nav-0.9.0.jar &
echo "运行 lms-nav-x.x.x.jar 完成！"
