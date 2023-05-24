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

### 10- Por boas praticas nao se pode enviar todo o projeto, há itens de segurança, como por exemplo na settings.py, a SECRECT_KEY <h3>

= Para isso existe um pacote de variaveis de ambiente que serve para que quando suba para o github nao envie essas chaves.
= instalar dependencia python-dotenv
= pip freeze > requirements.txt (para atuailizar o arquivo de pacotes)
= Criar na raiz do projeto um arquivo .env e colar o secret key - Linha 23 settings.py (Remover Aspas)
= no arquivo .env inserir SECRECT_KEY = com aspas simples
= linha 13 inserir:
from pathlib import Path, os
from dotenv import load_dotenv

load_dotenv()

### 11- Git Ignore <h3>

= Gerar um arquivo .gitignore na raíz do projeto
= Acessar gitignore.io para gerar o gitignore da linguagem utilizada

### 12- Django Admin <h3>

= Por padrão o Django já possui uma tela Admin (/admin)
= Comando para criar admin
    = python manage.py createsuperuser

### 13- Criar App <h3>

= python manage.py startapp nome_do_app
= adicionar o app no setup/settings.py -> nome_do_app.apps.nome_do_appConfig (informação pode ser coletada no app.py na pasta do app criado)
= Editar urls.py
    = from django.urls import path

        urlpatterns = [

        ]
= Adiconar nome_do_app em setup/urls.py
    = Exemplo:
        = urlpatterns = [
            path('admin/', admin.site.urls),
            path('', include('nome_do_app.urls')),
        ] + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)