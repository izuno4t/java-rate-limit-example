# java-rate-limit-example

以下のライブラリを使った RateLimit の実装例

* Guava - 汎用的に使えるが、実装クラスに`@Beta`が設定されているかつ、制限する期間を1秒単位でしか指定できないのでイマイチ。
* Bucket4j - RateLimit をターゲットにしたライブラリ。一般的に RateLimit として発生する要件は満たせてそう
* Armeria - Bucket4jを使って、RateLimitをそもそも組み込んだマイクロサービス向けのフレームワーク


## refs

### Guava

- [google / guava](https://github.com/google/guava)
- [guava の RateLimiter を用いた Rate-Limiting](https://qiita.com/moaikids/items/507448c590f69f1cf5ae)
- [Quick Guide to the Guava RateLimiter](https://www.baeldung.com/guava-rate-limiter)
- [GUAVA RATELIMITERのクイックガイド](https://ja.getdocs.org/guava-rate-limiter/)
- [guava の RateLimiter を用いた Rate-Limiting - Qiita](https://qiita.com/moaikids/items/507448c590f69f1cf5ae)

### Bucket4j

- [Rate Limiting a Spring API Using Bucket4j | Baeldung](https://www.baeldung.com/spring-bucket4j)
- [Rate limiting Spring MVC endpoints with bucket4j](https://golb.hplar.ch/2019/08/rate-limit-bucket4j.html)
- [JavaでRate Limitをする方法(bucket4j)](https://yu-memorandum.hatenablog.com/entry/2020/08/16/021735)


### Armeria

- [Armeria](https://armeria.dev/)





https://qiita.com/moaikids/items/63a01dddc0c6870e1dbb