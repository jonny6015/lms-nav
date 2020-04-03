#!/usr/bin/env bash
time=$(date "+%Y-%m-%d %H:%M:%S")
echo "${time}"
git pull
git add -A
git commit -m "更新于:${time}"
git push
exit 0;
