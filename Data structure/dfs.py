# -*- coding: utf-8 -*-
"""
Created on Wed Dec 14 16:18:22 2022

@author: sethy
"""

graph = {
  '5' : ['3','7'],
  '3' : ['2', '4'],
  '7' : ['8'],
  '4' : ['8'],
  '8' : [],
  '2':[]
      }

visited = set() 

def dfs(visited, graph, node):  
    if node not in visited:
        print (node)
        visited.add(node)
        for neighbour in graph[node]:
            dfs(visited, graph, neighbour)

print("Following is the Depth-First Search")
dfs(visited, graph, '5')