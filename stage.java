{\rtf1\ansi\ansicpg1252\cocoartf2820
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww12540\viewh14860\viewkind1
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public abstract class Stage \{\
    protected String stageName;\
    protected int difficultyLevel;\
\
    public Stage(String stageName, int difficultyLevel) \{\
        this.stageName = stageName;\
        this.difficultyLevel = difficultyLevel;\
    \}\
\
    public abstract int completeStage();\
\
    public String getStageName() \{\
        return stageName;\
    \}\
\}\
}