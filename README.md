Heroku Leiningen Plugin
=================

This plugin is used to deploy Clojure applications directly to Heroku without pushing to a Git repository.
This is can be useful when deploying from a CI server or when the Leiningen build is complex.

## Using the Plugin

Add the following to your `project.clj` file:

```clj
:plugins [lein-heroku "0.4.4"]
```

Next, add something like this to your `project.clj` if you do not have a Heroku Git repo in your `git remote`s.

```scala
:heroku {:app-name "your-heroku-app-name"}
```

Now, if you have the [Heroku Toolbelt](https://toolbelt.heroku.com/) installed, run:

```sh-session
$ lein heroku deploy
```

If you do not have the toolbelt installed, then run:

```sh-session
$ HEROKU_API_KEY="xxx-xxx-xxxx" lein heroku deploy
```

And replace "xxx-xxx-xxxx" with the value of your Heroku API token.

### Requirements

+  You must use Java 1.7 or higher locally.

### Configuring the Plugin

You may set a `:heroku` element in your `project.clj` like so:

```scala
:heroku {
  :jdk-version "your-heroku-app-name"
  :include-files ["target/myapp.jar"]
  :process-types {
    "web" "java -jar target/myapp.jar"}}
```

By default, the plugin will include the `target` directory.


## License

Source Copyright © 2015 Heroku.
Distributed under the Eclipse Public License, the same as Clojure
uses. See the file COPYING.
