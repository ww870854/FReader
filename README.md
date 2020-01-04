# 主要功能

- 支持搜索、在线阅读网络小说
- 可通过分类查找网络小说
- 支持导入并阅读本地 TXT，本地 EPUB 小说
- 阅读界面可自定义屏幕亮度、字体大小、行距、背景颜色等
- 实现仿真翻页动画效果

# 技术点

- 项目基于 MVP 模式开发，封装了 Okhttp 请求
- 自定义 View 显示小说内容，并且实现了仿真翻页动画
- 解析 EPUB 小说：Pull 解析 XML，Jsoup 解析 html
- 仿掌阅实现 TabLayout 滑动时的字体和 Indicator 动画效果
- 使用揭露动画实现底部导航栏 icon 的点击效果
- 实现 RecyclerView 的多选删除和分页加载

# 界面截图

图片经过压缩后可能比较模糊，请见谅

![](https://i.ibb.co/bPsbxTh/freader-1.png)

![](https://i.ibb.co/ykLZC4F/freader-2.png)

![](https://i.ibb.co/NFfBwk6/freader-3.png)

![](https://i.ibb.co/7Xp6PN2/freader-4.png)

![](https://i.ibb.co/b5yWNTQ/freader-5.png)

# 最后

APK 下载地址：[下载点我](https://github.com/Mrfzh/FReader/releases/download/v1.0/FReader.apk)

Github 地址：[Mrfzh/FReader](https://github.com/Mrfzh/FReader)

发现项目中有任何问题或者有其他不懂的，欢迎在 github 上 issues。

如果觉得这个项目对你有帮助，请点个 **Star** 支持一下，谢谢！

# 声明

本项目为个人练习项目，所有数据均来自网络，未经允许，请勿用于商业用途。

如有侵权，请联系作者删除！

