#!/usr/bin/env python3

import sys 
import matplotlib.pyplot as plt
import math 

def plotter(filename):
    data=[[],[]]
    
    raw = []
    with open(filename) as f:
        raw = f.readlines()
    for line in raw:
        nugget = line.split('$')
        data[0].append(int(nugget[0]))
        data[1].append(float(nugget[1]))
        
    plt.plot(data[0],data[1])
    plt.xlabel="Angle"
    plt.ylabel="Sin"
    plt.show() 



if __name__ == "__main__":
    print(sys.argv[1:])
    print(sys.argv[1])
    plotter(sys.argv[1])