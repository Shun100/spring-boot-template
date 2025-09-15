# Spring Boot Template

- Spring Bootのテンプレートです。社内勉強会や今後プロジェクトへの導入を見越して作成しました。

## 動作確認環境

|       ソフトウェア名       | バージョン |                                              備考                                              |
| -------------------------- | ---------- | ---------------------------------------------------------------------------------------------- |
| Java                       | 21         | Gradleが依存関係解決時にインストールするため、予めのインストールは不要                         |
| VScode                     | 1.104.0    |                                                                                                |
| Gradle                     | 8.14.3     | プロジェクトの中にGradler Wrapperが含まれているため、予めのインストールは不要                  |
| Language Support for Java  | 1.45.0     | [Marketplace](https://marketplace.visualstudio.com/items?itemName=redhat.java)                 |
| Spring Boot Extension Pack | 0.2.2      | [MarketPlace](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack) |

## 動作確認手順

1. VSCodeをインストールする。
2. 拡張機能「Language Support for Java」と「Spring Boot Extension Pack」をインストールする。
3. 本ソースコードをダウンロードして配置する。
4. プロジェクトルート直下でビルド＋デプロイコマンドを実行する。
    ``` bash
    ./gradlew.bat bootRun
    ```
5. ブラウザから`http://localhost:8080/demo`にアクセスする。

## コマンドチートシート

- ビルド＋デプロイ
  ``` bash
  ./gradlew.bat bootRun
  ```

- ビルドのみ（ソースコード変更時に実施）
  ``` bash
  ./gradlew.bat build
  ```
