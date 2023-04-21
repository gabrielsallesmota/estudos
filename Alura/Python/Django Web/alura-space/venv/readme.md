*Configurações Iniciais Projetos*

**1- Instalação PIP**

=Windows=
curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python get-pip.py

=Mac=
curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python3 get-pip.py

=Linux= 
sudo apt install python3-pip

**2- Instalação Virtualenv**

pip install virtualenv

**3- Download FrontEnd - Exclusivo para este projeto**

https://github.com/alura-cursos/alura_space/archive/refs/heads/projeto_front.zip

**4- Estabeleça um ambiente virtual dentro do diretório do projeto**

=Windows=
python -m virtualenv venv

=Linux/Mac=
virtualenv -p python3 venv

**5- Ative o ambiente virutal**

=Windows=
source venv/Scripts/activate

=Linux/Mac=
source venv/bin/activate

**6- Instalar o Django**

pip install django 

**7- requirements.txt - Boas Praticas**

Por boas praticas é necessário gerar um arquivo requirements.txt na raíz do projeto

pip freeze > requirements.txt

**7- Crie o Projeto Django**

django-admin startproject setup .

**8- Rode o servidor pela primeira vez**

python manage.py runserver
