#!/usr/bin/env groovy
def name = env.name
echo "Hello $(name}"
def call(String name){
	echo "Hello ${name}"
}
