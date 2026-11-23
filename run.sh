#!/usr/bin/env bash
# Compila todo o src/ e executa a main de um tema.
# Uso: ./run.sh <pacote.ArquivoKt>
# Ex.: ./run.sh classes.ClassesKt
#      ./run.sh heranca.HerancaKt
set -euo pipefail

MAIN=${1:?"Uso: ./run.sh <pacote.ArquivoKt> — ex.: ./run.sh variaveis.VariaveisKt"}

kotlinc src -d out/app.jar
kotlin -cp out/app.jar "$MAIN"
