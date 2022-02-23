#!/usr/bin/env groovy
def name = env.name

def call(String name){
	echo "Hello ${name}"
}
