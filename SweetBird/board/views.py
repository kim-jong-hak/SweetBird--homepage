# Create your views here.
from django.shortcuts import redirect, render
from .models import Board

# Create your views here.
def board_list(request):
    board_list = Board.objects.all()
    return render(request,'board/board_list.html', {"board_list": board_list})

def board_view(request, board_id):
    print(board_id)
    board = Board.objects.get(board_id=board_id)
    return render(request, "board/board_view.html", {"board": board})


def board_write(request):
    if request.method == 'POST':
        Board.objects.create(
            board_name=request.POST['board_name'],
            contents=request.POST['contents'],
            user_id = 0,
            board_id = Board.objects.count() + 1
        )
        return redirect('/board/list/')
    return render(request, 'board/board_write.html')
