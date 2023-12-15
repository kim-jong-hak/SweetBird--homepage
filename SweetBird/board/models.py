from django.db import models

# Create your models here.
# 게시글(Post)엔 제목(postname), 내용(contents)이 존재합니다
class Board(models.Model):
    board_id = models.IntegerField()
    user_id = models.IntegerField()
    board_name = models.CharField(max_length=50)
    contents = models.TextField()

    def __str__(self):
        return str(self.board_name)