## 開心寫 code
- 2020/11/11 目前只有在寫 JAVA ~ :smiley:

### Maven 3.6.1 與 OpenJDK-8 環境 , 製作 docker 可攜帶開發環境
- 啟用環境
```
docker run -d --name my-java-dev -p 8080:8080 -p 80:5000 -v $(pwd)/:/root/ -w /root/ hongyuanyang/my-dev:mvn3.6.1-jdk8
```
#### code-server
- [參考網址](https://github.com/cdr/code-server)

#### code-server extensions
- Java Extension Pack
- JDK
- Spring Initializr
- Spring Boot Tools

#### 新的 java 基本語法資源
- [參考網址](https://ethan-imagination.blogspot.com/p/javase.html)
- [良葛格 - JavaSE6 markdown 教材](https://github.com/JustinSDK/JavaSE6Tutorial/tree/master/docs)

#### 新的 spring 好看的語法資源
- [某人的 blog , 以他理解的邏輯去閱讀感覺收穫還滿多的](https://github.com/albert-hg/learning-from-jhipster/tree/master)

#### 2020-11-16
~~自己覺得讀到現在 , 漸漸的理解 java 的概念與一些歷史淵源 , 也開始理解這門語言的基本特性 .~~
~~幾經思考後 , 決定放棄繼續深究該門語言的各種技巧與工具去作為我的第一門開發語言 .~~
~~原因有其下 (這也是讀這麼久才總結的一些想法 , 雖不一定正確 , 但是思考後的感受)~~
~~- java 語法其實有趣且風格嚴謹 , 這對於新手來說去訓練一門程式語言很有幫助 . 但也因為從以前到現在歷經多種版本 , 大版本更新 , 現在的 java 語法包裝的更多奇淫技巧 , 導致網絡上的自學資源對於"入門語法"的定義非常零散~~
~~- 基於 java 的工具諸如 "專案管理工具 maven/grandle" "框架 spring/springMVC/springBoot" 等等 , 由於歷史長久 , 為往後兼容雖做了很多簡化及優化 , 卻屏蔽了許多從 0 -> 1 的步驟 , 直接從 1 開始 , 這導致自學的人非常混亂 .~~
~~- 最後是自學入門的人對於步驟的定義非常混亂 , 雖說基本概念是從一門語言的語法開始學習 (卻因為歷史上工具眾多 , 不斷跌代 , 不斷簡化) 進一步隱藏了許多從裡到外的知識 , 導致自己練習開發時會遇到非程式語言本身造成的問題 , 而是工具上不理解 , 忽略某個配置或錯誤配置了某個檔案 , 導致整體開發流程跌跌撞撞 .~~
    ~~- 以目前來說我是 Java 基本語法 -> Java OOP 概念 -> Java 基本常用套件庫操作(例如file handling) -> 讀了一些 maven 專案管理工具 -> 讀了基本 spring 框架和 vscode 如何配置 spring 的開發環境(最後這邊採了很多坑 , 也是在這邊發現有非常多問題其實是學習過程中順序可能有問題導致非常多預備知識並不足)~~
~~- 結論 , 這是從入門到放棄的一個練習 java project . 但總結來說學到很多概念 , 對於一門語言的學習其實也進一步更了解了.~~

~~##### 後來發現 java 後面的版本又更延伸了許多工具和語法糖 , 但公司其實採用的版本非常舊 , 自己心裡其實也有問號是 java 學了一版本後 , 若未來要進版 , 似乎難易度也較其他現代語言要大~~

~~##### 後來發現 java 後面的版本又更延伸了許多工具和語法糖 , 但公司其實採用的版本非常舊 , 自己心裡其實也有問號是 java 學了一版本後 , 若未來要進版 , 似乎難易度也較其他現代語言要大~~
