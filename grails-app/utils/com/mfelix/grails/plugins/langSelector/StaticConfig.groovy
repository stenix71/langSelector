package com.mfelix.grails.plugins.langSelector

import grails.util.Holders

class StaticConfig {
    /** this static property can be overriden by config */
    static final LANG_FLAGS = [
        'es': 'es',
        'en': 'gb',
        'fr': 'fr',
        'da': 'dk',
        'de': 'de',
        'it': 'it',
        'ja': 'jp',
        'nl': 'nl',
        'ru': 'ru',
        'th': 'th',
        'zh': 'cn',
        'pt': 'pt'
    ]

    //com.mfelix.grails.plugins.langSelector
    static Map<String, String> getConfig() {
        Holders.config.com.mfelix.grails.plugins.langSelector.lang.flags ? Holders.config.com.mfelix.grails.plugins.langSelector.lang.flags : LANG_FLAGS
    }
}
