#!/usr/bin/env groovy
def name = env.name
echo "Hello $(name}"
def call(name){
	echo "Hello ${name}"
}
