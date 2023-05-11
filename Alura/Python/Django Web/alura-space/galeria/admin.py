from django.contrib import admin

from galeria.models import Fotografia


class ListandoFotografias(admin.ModelAdmin):
    # list_display = determina colunas menu admin
    list_display = ("id", "nome", "legenda")
    # links que irão aparecer no menu admin
    list_display_links = ("id", "nome")
    # adiciona campo busca
    search_fields = ("nome",)
    # filtrar por categoria
    list_filter = ("categoria",)
    # itens por página
    list_per_pages = 10


admin.site.register(Fotografia, ListandoFotografias)
