# -*- coding: utf-8 -*-
"""
Created on Wed Dec 14 16:16:07 2022

@author: sethy
"""

graph = {
  '5' : ['3','7'],
  '3' : ['2', '4'],
  '7' : ['9','6'],
  '2' : [],
  '4' : ['8'],
  '8' : [],
  '6' : [],
  '9' : []
}

visited = [] 
queue = []   
def bfs(visited, graph, node):
  visited.append(node)
  queue.append(node)

  while queue:        
    m = queue.pop(0) 
    print (m, end = " ") 

    for neighbour in graph[m]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

print("Following is the Breadth-First Search")
bfs(visited, graph, '5')     