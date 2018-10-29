#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}

def test(name) {
  echo "/usr/local/bin/${name}"
}

