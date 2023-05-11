# **_Configurações Iniciais Projetos_** <h1>

### 1- Instalação PIP <h3>

=Windows=&nbsp;
curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python get-pip.py

=Mac=&nbsp;
curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python3 get-pip.py

=Linux=&nbsp;
sudo apt install python3-pip

### 2- Instalação Virtualenv <h3>

pip install virtualenv

### 3- Download FrontEnd - Exclusivo para este projeto <h3>

https://github.com/alura-cursos/alura_space/archive/refs/heads/projeto_front.zip

### 4- Estabeleça um ambiente virtual dentro do diretório do projeto <h3>

=Windows= &nbsp;
python -m virtualenv venv

=Linux/Mac= &nbsp;
virtualenv -p python3 venv

### 5- Ative o ambiente virutal <h3>

=Windows= &nbsp;
source venv/Scripts/activate

=Linux/Mac=&nbsp;
source venv/bin/activate

### 6- Instalar o Django**

pip install django 

### 7- requirements.txt - Boas Praticas <h3>

Por boas praticas é necessário gerar um arquivo requirements.txt na raíz do projeto

pip freeze > requirements.txt

### 8-  Crie o Projeto Django <h3>

django-admin startproject setup .

### 9- Rode o servidor pela primeira vez <h3>

python manage.py runserver