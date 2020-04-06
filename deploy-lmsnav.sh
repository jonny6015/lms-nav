#!/bin/sh
echo "删除【前】项目根目录内容为："
echo `ls -la /webroot/nav.lmsite.cn/`
rm -rf /webroot/nav.lmsite.cn/*
echo "删除【后】项目根目录内容为："
echo `ls -la /webroot/nav.lmsite.cn/`
echo "复制新的 jar 包..."
cp $WORKSPACE/$project_name/target/lms-nav-0.9.0.jar /webroot/nav.lmsite.cn/lms-nav.jar
java -jar /webroot/nav.lmsite.cn/lms-nav.jar
echo "成功启动项目："
echo `ps -ef | grep lms-nav.jar`


