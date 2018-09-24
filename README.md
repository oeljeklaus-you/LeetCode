# LeetCode刷题心得
## 在刷题过程中，主要按照数据结构划分
## 移动元素的解法
1.如果要移动元素，一般是快排，
2.如果要保持相对位置不变使用复制如题283，27
## 链表溢出问题
如果是要移除或者增加链表一般需要自己设置头节点，避免错误，出现移除问题
可以将后一个节点的元素复制给这个节点如题203
## 利用数据结构的特性求解
### Set集合的特性
例如LeetCode题349，求两个数组的交集，使用HasHSet求解，其实有4种方案，详细将题349
### List集合的特性
例如LeetCode题350,349的加强版
## 双指针法
### 求解倒数第k节点和删除倒数第k节点
针对于求解倒数第k节点和删除倒数第k节点，那么将会双指针方法，可以看题19
### 判断链表是否有环
LeetCode题141,使用快慢指针即可，但是加强题142需要数学推理
### 接雨水问题
LeetCode题42,这里直接计算出两端最大值然后判断即可，具体思路见代码
## 快慢指针法
通过快慢指针判断题设，比较典型的题型有141，和160公共节点求解
## 树
### 二叉搜索树
二叉搜索树的中序遍历是有序的，题653主要考察这个知识点是题167的变种
### 层次遍历解决的问题
1。leetcode题404左叶子节点的和
### 子树
判断一个树是否是一个树的子树或者是子结构，首先要判断各个子树即可题574
## 字符匹配问题
针对于字符匹配以及变种问题，一般都使用Stack数据结构来解决，可以查看题32,这是匹配问题的变种问题
## 逆波兰表达式
对于这一类问题，也是使用栈数据结构，求解的是操作数就进行压站，遇到操作符就出栈，弹出两个数字计算，如果不能就出错了,题150
## 字符串
### 字符串移动问题
  向左移动k位等于向右移动n-k位，移动问题一般是找到翻转基准线，左边翻转，右边翻转，最后整体翻转
### 最长公共子序列LCS
### hash映射
有时候题目出现全是小写或者大写的，可以使用hash映射，例如题387
### 单词的同分异构体
LeetCode题242,49这里主要介绍的是素数相乘
### 树的层次遍历
树的层次遍历的各种问题 1、树的最小深度 题111 2、是否是镜像树 题101
## 循环不变式应用
### 找到迷失的整数
leetCode题268，具体解法是如果现在的值小于i或者后者大于等于数组长度舍弃，如果不等于，就将该值放在合适的位置，最后就是i++
### 迷失的数
较于题268，题42需要判断有重复的数 解题思路见题42
## 旋转问题通用解法
1。先整体翻转，2。在找到中间点，然后部分翻转。例如题189
## 局部最值问题
### 排序旋转数组中的最小值
LeetCode题152 由于是排序的，最好利用排序的性质，二分法，时间复制度极小，这里要注意排除顺序与逆序的情况
### 有重复元素的排序旋转数组中的最小值
LeetCode题153 由于是排序的，最好利用排序的性质，二分法，时间复制度极小，这里要注意排除顺序与逆序还有就是重复元素的情况
### 二分查找搜索
LeetCode题81和题33，由于数组是排序的翻转，那么必然部分属于二分查找的性质，这我们需要注意的是在查找中有重复元素的出现，那么就要一个一个搜索了
## 快速排序问题
### 寻找第k大的数
这里使用快速排序，快速排序将数组分位两个部分，如果前半段的元素数量比k大，那么就在前半段递归，否则在后半段递归。
## 排列组合问题(回溯法)

## 数字缺失问题
### 数字缺失中无重复数字
如果给定一个长度的数组，里面是连续的自然数，有缺失，解该决呢？题42
## 动态规划问题
### 解题总体思路
先求初始值，然后求解转化方程式，然后求出最大值即可
### 最长公共子序列
题300，还有一种时间复杂度是O(nLogN)的解法
### 最小路径和
二阶动态规划 题64
### 杨辉三角形
二阶动态规划 题120
### 不同的路径
二阶动态规划 题62
## 根据所给的数据特征进行编程
### 结合数组特征，翻转数字
题442 将定位的数组反转
## 刷题要注意的事情
### 为空
对于一些数组和指针，需要判断是否为空，还有就是二维数组，防止[[]]这种情况
### 整数溢出
对于整数的相加、相乘、相减要防整数溢出的问题
### 链表问题
在没有特殊要求的情况下，可以自己定义一个含头指针的链表，这样可以避免很多错误
例如题 2
### 翻转问题
字符串的处理类StringBuilder中又一个翻转函数 reverse()
