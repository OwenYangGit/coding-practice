## 開心寫 code
- 2020/11/11 目前只有在寫 JAVA ~ :smiley:

### Maven 3.6.1 與 OpenJDK-8 環境 , 製作 docker 可攜帶開發環境
- 啟用環境
```
docker run -d --name my-java-dev -p 8080:8080 -v $(pwd)/:/root/ -w /root/ hongyuanyang/my-dev:mvn3.6.1-jdk8
```
#### code-server
- [參考網址](https://github.com/cdr/code-server)
