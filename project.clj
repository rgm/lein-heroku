(defproject lein-heroku "0.4.4"
  :description "Leiningen plugin that deploys to Heroku"
  :url "https://github.com/heroku/lein-heroku"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [
    [com.heroku.sdk/heroku-deploy "0.4.4"]
    [com.fasterxml.jackson.core/jackson-core "2.2.0"]
    [com.fasterxml.jackson.core/jackson-annotations "2.2.0"]
    [com.fasterxml.jackson.core/jackson-databind "2.2.0"]]
  :eval-in-leiningen true)
