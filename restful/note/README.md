## 簡介
- REST 意思是 REpresentational State Transfer (表示狀態的移轉)
- REST 有許多不同的呈現方式去表示一個 resources , 例如 json , xml , text .... 等等
- REST 是用 "URI" 定義 resources

## 甚麼是 resources
- REST architecture treats every content as a resource. These resources can be Text Files, Html Pages, Images, Videos or "Dynamic Business Data".
- A resource in REST is a similar Object in Object Oriented Programming or is like an Entity in a Database (像 OOP 裡面的物件 , 或 DB 裡面的 entity)

### 好的 resource 表示法
- 三個 REST 設計原則
  - Understandability 易懂
  - Completeness 完整性 , 一種資源可以包含其他資源 , 輸出能夠同時包含簡單或複雜的資料結構
  - Linkablity 可連接性 , 一個資源可以被關聯其他資源 , 同一種情況可以用同樣手法處理

## 建構標準的 REST URI
- 使用複數名詞 , 舉例來說 , 用 users 來定義使用者資源
- 避免使用 <space> 空白鍵 , 可以使用 _ 或 - 來標識連接
- 使用小寫的字母標識資源
- 維護往後的兼容性 , 因為 web 服務是公共服務 , 一旦被創建 , URI 應該永久可用 , 如果舊的 URI 因為某些原因被棄用 , 你應該使用 redirect 舊的 URI 到新的 URL 並顯示 HTTP STATUS CODE 300
- 總是使用 HTTP METHOD , GET / POST /DELETE ... 操作 resource , 非常不建議在 URI 裡面創建 METHOD 的名稱 -> /get/users (x)

## 常見的 HTTP METHOD 操作考慮重點
- GET 方法應該是唯讀且安全的
- PUT 和 DELETE 操作應該要返回相同的結果 (無論 PUT 幾次 , DELETE 幾次)
- PUT 跟 DELETE 兩者非常相似 , 差異在於 PUT 結果是不變的 , 但 POST 返回結果會有變化

## 無狀態
- Server 端不應該存儲 Client 端的狀態 , Server 端應該透過 Client 傳遞過來的 " identifier 標識符" 來保持(保留) Session

### 無狀態的優勢
- web 服務可以獨立處理每個發送的請求
- web server 無須維護用戶之前 "交互" 的狀態 , 大大降低 web 應用的複雜度 (也簡化了 web 應用的設計)
- HTTP 本身就是無狀態 , 可以與 REST 無痛合作

### 無狀態的劣勢
- REST 必須要在 client 送過來的請求獲取 "其他資訊" 來確保了解 client 之前與 server 交互的狀態 , 避免 client 受到影響

## Cache
- 目的在於存儲 server 返回的資料在 client 自己那邊好讓 client 不需總是發出相同資源(same resources)的 request 
- server 應該返回(response)一些有關於 cache 資訊的運作讓 client 可以進行時效性的 cache
- 為了針對 client 的 cache 做一些配置 , 有些 header 在 server 的 response 可以使用
  - Date 該資源何時被創建
  - Last Modified 該資源上一次被修改的時間
  - Cache-Contorl 主要的 cache 設定
  - Expires 該 cache 何時過期失效
  - age 跟 expires 差不多 = =" (目的是為了解決 expires 的問題)
  ```
  參考資料 https://blog.techbridge.cc/2017/06/17/cache-introduction/
  因為 expires 是檢查 local 時間 , 假如有人的 local 時間不準確就會有問題 , 因此 age 是針對 "fetch time" 去計算時間的
  如果同時配置 age 和 expires , 會採用 age
  ```
### Cache-Control 的參數
- public 表示該資源可以被任何 component cacheable
- private 表示該資源僅能被 server 跟 client cacheable , 任何中間件都無法 cacheable
- no-cache / no-store 表示該資源無法被 cacheable
- max-age 表示在多少時間內被 cache 住 , 這段時間內 client 針對該資源不需要在發送其他請求
- must-revalidate 表示如果 max-age 時效過了 , server 必須重驗證該資源

### Cache 最佳建議
- 總是 cache 住 static files (css / js / image) , 並設定過期時間 2~3 天
- 永遠不要設定過長的時效
- 動態性的內容應該僅設定 cache 幾小時就好

## REST 安全性
- 因為 REST web 服務可與 web url 一起採用 , 所以對於維護 web 的安全方法論變得非常重要

### 基於 REST 設計時的最佳建議
- 驗證所有 request 到 server 的 input , 避免 SQL/NoSQL injection
- 基於 Session 的身分驗證 , 每當發送 request 到 server 時 , 請使用基於 session 的身分驗證來驗證 client 身分
- URL 中不要夾帶 "敏感性資料" , username / password / token 等等 ... , 應該使用 POST method 來夾帶這些資訊
- 限制 method 執行 , 例如 GET 不該可以刪除 resource
- 驗證格式 , 例如 client 送過來的是 json 還是 xml
- 引用通用的 HTTP , 例如 403 禁止訪問等等