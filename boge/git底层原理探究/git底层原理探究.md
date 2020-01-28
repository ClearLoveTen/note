#git的底层原理探索

###1.文件内部存储原理

1。第一步我们首先在本地新建一个Git仓库

```
mkdir demo 创建一个文件夹
cd demo    进入该文件夹
git init   初始化一个Git仓库库
```

2.我们可以看到在当前文件夹下有一个 .git  的隐藏目录，进入该目录，查看该目录下的所有文件

![image](C:\Users\111\Desktop\学习笔记\boge\git底层原理探究\image\TIM截图20200126150947.png)

我们可以看到当前文件夹下有7个文件，具体的功能我贴在下方

![img](C:\Users\111\Desktop\学习笔记\boge\git底层原理探究\image\1690665-6458ddc5b28b057a.webp)

而对于我们的了解存储原理只需要重点关注 objects 文件夹。



在Git中，每个commit ID的信息（如cc127537978af35e2f502da7e8d22e340ed810e5）就是一个SHA-1 Hash值，它是对那个commit是Git仓库中内容和头信息（Header）的一个校验和(checksum)。


objects 目录存储所有数据内容；refs 目录存储指向数据（分支）的提交对象的指针；HEAD 文件指示目前被检出的分支；index 文件保存暂存区信息。 我们将详细地逐一检视这四部分，以期理解 Git 是如何运转的。

git的文件对象分为四类分别为blob、tree、commit、tags。



 ###初始化一个空白的git文件。
 git cat-file -t
 git cat-file -p

 ###初始化一个空白的git文件。
 ###初始化一个空白的git文件。
 ###初始化一个空白的git文件。
 ###初始化一个空白的git文件。



