# LeetCode刷题心得
## 在刷题过程中，主要按照数据结构划分
## 移动元素的解法
1.如果要移动元素，一般是快排，
2.如果要保持相对位置不变使用复制如题283，27
## 链表溢出问题
如果是要移除或者增加链表一般需要自己设置头节点，避免错误，出现移除问题
可以将后一个节点的元素复制给这个节点如题203
## 双指针法
针对于求解倒数第k节点和删除倒数第k节点，那么将会双指针方法，可以看题19
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
