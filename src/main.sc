require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    state: start
        q: $regex</start>
        a: Начнем!
    state: hello
        q: (*~привет*/*~здравст*/*~hello*/*~добрый*/*~здорово*/*~здравствовать*/*~доброе*/*~приветствую*/*~доброго*/*~good*/*~здрав*/*~желаю*)
        a: Привет привет

    state: weather
        q!: (*~погода*/*~осадк*/*~дождь*/*~снег*/*~град*)
        a: Погода сегодня дождливая.
        
    state: currency
        q!: (*~курс*/*~евро*/*~доллар*/*~currency*/*~USD*/*~USDT*/*~юань*/*~обмен*)
        a: доллар 92.62, евро 100,22

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}
