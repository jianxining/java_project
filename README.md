git提示Can't update(master has no tracked branch)

原因：本地分支和远程分支没有关联，需要关联远程分支
解决方案：git push --set-upstream origin master
这样本地分支就和远程master分支关联
