from django.urls import path

from . import views


urlpatterns = [
    # path('', views.index, name='index'),
    path('board/list/', views.board_list),
    path('board/view/<int:board_id>/',views.board_view),
    path('board/write/', views.board_write),
]