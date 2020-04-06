#!/bin/sh
echo "停止 Tomcat ..."
echo "停止 Tomcat ..."
echo `systemctl status tomcat.service`

echo "删除旧的项目 ROOT 目录..."
rm -rf /webroot/nav.lmsite.cn/ROOT
echo "根目录内容为："
echo `ls -la /webroot/nav.lmsite.cn/`
echo "删除旧的 war 包..."
rm -rf /webroot/wars/lms-nav.jar
echo "/webroot/wars 目录下的内容为："
echo `ls -la /webroot/wars/`

echo "复制新的 war 包..."
cp $WORKSPACE/$project_name/target/lms-nav-0.9.0.jar /webroot/wars/lms-nav.jar
echo "/webroot/wars 目录下的内容为："
echo `ls -la /webroot/wars/`

echo "启动 Tomcat..."
echo `systemctl start tomcat.service`
echo `systemctl status tomcat.service`
echo "Tomcat 启动成功！"



