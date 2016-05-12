git remote set-url origin https://github.com/DevCH43/Contactos.git
git config --global user.name "DevCH43"
git config --global color.ui true
git config core.fileMode false
git config --global push.default simple

git checkout master

git status

git add pantallas/ .

git commit -m "Update 4"

git push -u origin master

exit
