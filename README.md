Rival Chess Openings
====================

A very small opening library. It makes use of the [Rival Chess Model](https://github.com/chris-moreton/rivalchess-model).

```
    Move move = OpeningLibrary.getMove("rnbqkbnr/pppp1ppp/8/4p3/4P3/5N2/PPPP1PPP/RNBQKB1R w KQkq - 0 1")
```

### Installation

#### Maven

    <dependency>
        <groupId>com.netsensia.rivalchess</groupId>
        <artifactId>rivalchess-openings</artifactId>
        <version>1.0.3</version>
    </dependency>
    
#### Gradle

    compile group: 'com.netsensia.rivalchess', name: 'rivalchess-model', version: '1.0.3'