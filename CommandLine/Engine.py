#! /usr/bin/env python3

import matplotlib.pyplot as plt
import math 

def fileGenerator():
    myfile = open('results.txt','w')
    x=[]
    y=[]
    for i in range(0,360):
        x.append(i)
        y.append(math.sin(i/57.3))
        myfile.write("{}${}".format(str(i),str(math.sin(i/57.3))))
        myfile.write('\n')
    myfile.close()

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


# if __name__ == "__main__":
    # fileGenerator()
#     plotter("results.txt")