from django.contrib import admin

from apps.galeria.models import Fotografia


class ListandoFotografias(admin.ModelAdmin):
    # list_display = determina colunas menu admin
    list_display = ("id", "nome", "legenda", "publicada")
    # links que irão aparecer no menu admin
    list_display_links = ("id", "nome")
    # adiciona campo busca
    search_fields = ("nome",)
    # filtrar por categoria
    list_filter = ("categoria", "usuario")
    # itens por página
    list_per_pages = 10
    # tornar o publicada disponível para alteração na pagina de Fotografias 
    list_editable = ("publicada",)


admin.site.register(Fotografia, ListandoFotografias)
