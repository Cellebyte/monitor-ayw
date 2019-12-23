from django.http import HttpResponse


def hello(request, name='World'):
    return HttpResponse(f"Hello, {name}.")