
# Github
https://github.com/erdnute/notes
git@erdnute.de / o,o,git

# Bitbucket
https://bitbucket.org/erdnute/eins
ralf@erdnute.de/o,o,bb

---------------------------------------------------------------------

# GIT

## Repository anlegen aus bestehendem Verzeichnis
    $ git int

## ADD - Dateien  zur Versionskontrolle hinzufügen
* git add wird zu verschiedenen Zwecken eingesetzt. Man verwendet ihn, um neue Dateien zur Versionskontrolle hinzuzufügen, Dateien für einen Commit zu markieren und verschiedene andere Dinge – beispielsweise, einen Konflikt aus einem Merge als aufgelöst zu kennzeichnen
* Git merkt eine Datei in exakt dem Zustand für den Commit vor, in dem sie sich befindet, als "git add" ausgefüht wurde. Wenn sie nach dem "add" verändert wurde, wird diese Änderung ignoriert (erneutes add ist notwendig)
$ git add *.txt
$ git add readme.md

## Commit
$ git commit -m 'Kommentar'
$ git commit -a -m 'das -a macht ein add, dann erst commit.( abkuerzung)'

## Ein existierendes Repository klonen
* Mit git clone wird jede einzelne Version jeder einzelnen Datei in der Historie des Repositorys heruntergeladen
* also nicht wie bei "svn checkout" nur ein einziger Versionsstand
* Git legt ein Projekt-Verzeichnis an, initialisiert ein .git Verzeichnis darin (komplettes Repository), lädt alle Daten des Repositorys herunter, und checkt eine Arbeitskopie der letzten Version aus.

$ git clone [url]
$ git clone git://github.com/schacon/grit.git
$ git clone https://github.com/erdnute/notes.git
$ git clone https://erdnute@bitbucket.org/erdnute/eins.git

## Übertragungsprotokolle
* git:// 
* http(s):// 
* user@server:/path.git

## Status einer Datei
* untracked (noch kein "add")
* unmodified (seit dem letzten commit)
* modified (seit dem letzten commit)
* staged (für den nächsten Commit vorgemerkt, "Changes to be committed")

* "add" -> staged

$ git status


## Config
$git config --list
$git config --global core.editor "vim"

## .gitignore
* kann man selber anlegen
.-----------
*.class
bin/
*.exe
.-----------
* github.com/github/gitignore (A collection of useful .gitignore templates)


## log
$git log --pretty=oneline
$git log --pretty=format:"%h : %an : %ar : %s"
$git log --since=1.weeks
$git log --since="2017-12-22"
$git log --author="ralf"

## GitHub für neues Projekt einrichten
1. Login to Github
2. Create new Repository "code-examples"
3. in local console:
   $ git remote add origin https://github.com/erdnute/code-examples.git
   $ git push -u origin master




