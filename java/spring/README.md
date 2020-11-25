# Spring 預備知識 (一些概念性的東西)

## 預計閱讀
- MVC
- AOP
- DI,IOC
- SINGLETON
- SPRING配置(如何建立SPRING應用，包括如何配置設定檔使其運行)
- TOMCAT
- SPRINGBOOT

## MVC
[引用的參考資料](https://openhome.cc/Gossip/Spring/MVC.html)

### 甚麼是 MVC
- Model , View , Controller 的縮寫
- 為了讓同一份資料能有不同的畫面呈現方式 , 並且當資料被變更時 , 畫面可獲得通知並根據資料更新畫面呈現
- 是一種 "設計模式"


### 傳統的桌面應用 MVC 架構如下
![傳統桌面應用的 MVC](./images/MVC-1.jpg)
### 後來發現在 web 上也可以應用這樣 MVC 的概念 , 但因為 web 的 HTTP 特性(不 request 就不會有 response) , 因此誕生出 web-MVC , 如下
![Web-MVC](./images/MVC-2.jpg)

## AOP 