/**
 * 
 */
let stopTimer = false;
 const questions = [
        {
          question: "カンガルーはどの大陸に生息していますか？",
          options: ["アフリカ", "北アメリカ", "オーストラリア", "アジア"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGwsKWGagaxo5N6AVBXvyDUFeGI7MRTP1qQ2u-IUl0n5V0cW6Y8MtoHk7llzATicOpvuxy7sgDaWsvJcld_Xo6hKI4XRPE_r6VWlZZ5ywwKUtXkAiQXm5-tq80nFwRNJdVCIg30fR4rOemCq8K6Qdu5VAney-POC2AclrfymZWJYxiR8iq4CX0FbX4WS8DxfFNLili7ZOllGoEH-u1PpT-eN08_RLuOyD5TYBz2fmyN-GEmqov00nVsWO1xH3M32_Wg==/20230608_kangaroo1.jpg?errorImage=false"
        },
        {
          question: "ホエールシャークは何としても知られていますか ?",
          options: ["世界で最も速い動物", "世界で最も巨大な哺乳類", "世界で最も高い跳びの動物", "世界で最も長生きの動物"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG-Bd7WfZVnFnM15Po707LUsY7suobAlp-fyfIxP2frLeA3-hCow4DLOzpvxu7d87AoizMnkfD4zCHPXCT28T1qf9aDYQHgQoNlymrd0p_tkaqW8gt0OodPZYP56qw7pp2d6P-tLjkWvUtbve2Y1kosg-truc8hds9EakwnwLaQKvUwZ8FDXBpz6jC7e5Twz0B_4LoeLoETGRnXBKxzweor2wTsjDbV9XPrfdTKSO3sr0YMwWFECih4ub7OjFN-b7cp3GlEfuSWs8yIcmDKZB_H6Va2mt7vr15uy2tKoj5Ou2hCMMART10XB2GlT736NDkA==/o0500033314398499111.jpg?errorImage=false"
        },
        {
          question: "コアラは一般的に何を食べていますか ?",
          options: ["肉", "草", "昆虫", "ユーカリプタスの葉"],
          correctAnswer: 4,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG8Zn4ue3W3PYAWNEBrvfc7L4PornFmPArgAuF5dcIba0gcjldUyeQ0DxEyIJi9SXrHbsQnZJo1umEDagBi10d23Bb4m1VogCZralFkhbeAVGlkfokUIoRk1_sfW4rQi-L2tcUBoGfquiVhFU56iarQONDNyZw1k9Vm-uQNPdymKTuVv03SPQEpgWLg4LRwZmZx-vYDNK0owu-omPXnCVZMQq1GWpS9_EUPvuLVQvuOeD/25698_01.jpg?errorImage=false"
        },
        {
          question: "グリズリーベアはどの大陸に生息していますか ?",
          options: ["北アメリカ", "アフリカ", "南アメリカ", "ユーラシア"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG9pGJFgmfimfm0LnuUZaXp0Ra8yJjMD4-Jw7yF8MnQvziC-efUitQH7sCODlR7vRwgUwBmyXISNuvcGiuryczc1eQCJBebn62rzScXBE0l1U84JiXIgilb0IJ6lIPwQ8dHYJIyhyEmcyH7JtWdhDoE_zE-G845rxiiRDSH0WQWwmAfFrSOUIJ1xNsq1mBk3Bs7nXLseY_qewFYZtI1Xu-7A=/grzec2.jpg?errorImage=false"
        },
        {
          question: "パンダは一般的にどのような食事を好む動物ですか ?",
          options: ["肉食", "草食", "魚食", "昆虫食"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG5u5ZECb8BS1zyTe2QVT_EE-AqCDnv5XN6xKt08CiKbPBJb6JKBOP8GQcj6T7gT5-xLjjFdUBb79WrotK6QVM8YIGQaQgp_zXyOMzXZ5UTXUIb2rcGNfobhcX9YKraajS7ih0s5cO-fELGlU7hLD-mLo9jIXzZDlAulihpxbOd8CHFrwkIJxlt3tgKrvmB_6nGP3iNkvD-L6V2dzHZPIAKo=/20191211saihin.jpg?errorImage=false"
        },
        {
          question: "ペンギンはどの地域に生息していますか ?",
          options: ["北極", "南極", "アフリカ", "アジア"],
          correctAnswer: 2,
          image: "https://i.pinimg.com/originals/36/b7/c3/36b7c35356da6e93a6e88bce14f716eb.jpg"
        },
        {
          question: "ハチドリはどの特徴で有名ですか ?",
          options: ["長いくちばし", "長い尾羽", "超音速の飛行", "長い脚"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyidHiDsqYzS1Gg8vIj4JOHjQWuaudF4Fpk80B9R0bux_ixUx7VIiSyIYkKzwr7rMKPr7pMJskKCvBofLU0gqs8ggfheT3VZvQQXUlSp7XonUJPri_f4oM13YvxKrxXYsjLRQNo2QGC1ywl3c5W2-mEWKvGhHhNtw6J1xAAiHZ8PJpUeEOEpPbpD1NsL1UwRuA==/00.jpg?errorImage=false"
        },
        {
          question: "カラスが知能の高さで有名な理由は何ですか ?",
          options: ["ツールの使用", "空を飛ぶ速さ", "良い記憶力", "艶やかな羽毛"],
          correctAnswer: 1,
          image: "https://booth.pximg.net/c/620x620/29f50d4f-8a51-4ff8-8425-f6e33996851f/i/17647/9b736f77-e342-4b5d-8799-592737a526f7_base_resized.jpg"
        },
        {
          question: "アヒルは通常どのタイプの生息地で見られますか ?",
          options: ["森林", "砂漠", "河川や湖", "山岳地帯"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG-pfGX6pCElbZ5w5-TK7qtUVU1aLITD3OMGfvv6w0Fff6aoWap__A4vevsAlQFXCDwHflZnvElH9xUierdorjG8MfthgAOfXWfpCPoR8h-leaE4-W9uPEB76D8ZD-3inzFQkcsMOq8fa7lnY_tE4_YODME-b6z5qJ5HNjyxUrR3rBpeeNafrt0K-HIHvWSpEKNgxrbG2mleyDFwsQn24Tz5VSVr_bqsWMj0VjXZLmyzz/640_480.jpg?errorImage=false"
        },
        {
          question: "猫の一般的な特徴である「ひげ」は何のために役立つのですか ?",
          options: ["食事を探すのに役立つ", "視力を向上させる", "聴覚を強化する", "体温を調節する"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG2Lh7lTW1oHpnPEyZS7GROY-AqCDnv5XN6xKt08CiKbPGZV1rOZpZr64n41xv56PBZCzxlTC6OCnZJexQOEubNljsC0DJEVGKeW3LH7DTND-4la8ThpA8GIPGJvt4pap2OUgF6oEoLHbjJz3dv9N5g7FGlNyNpkEhqeih_mDGK-bYC7FYJ00LGAOuL4W2BndM1H8nfcSsjbJk-dvSS9c3cD6CJWzXmw55HaDBOh26b-9-YuGN7uxukSGVO-f73FxCQMrAGCx7RebJej61Tw9Wk08K5D1IDY9_c9bK7zPF0NqEN4f3ekKY7_nw7mJps7Mr2Lbt5IVYuxTBUSUVfftXtLCOAr6CzEev1fOt3vL-kfYNt6SGwLae0L7rz1lzViGxw==/gettyimages-1279899488_wide-f3860ceb0ef19643c335cb34df3fa1de166e2761-s1100-c50.jpg?errorImage=false"
        },
        {
          question: "猫は一般的にどのような活動時に最も活発になりますか ?",
          options: ["昼間", "夜間", "午前", "午後"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG2Lh7lTW1oHpnPEyZS7GROY-AqCDnv5XN6xKt08CiKbPGZV1rOZpZr64n41xv56PBZCzxlTC6OCnZJexQOEubNljsC0DJEVGKeW3LH7DTND-4la8ThpA8GIPGJvt4pap2OUgF6oEoLHbjJz3dv9N5g7FGlNyNpkEhqeih_mDGK-bYC7FYJ00LGAOuL4W2BndM1H8nfcSsjbJk-dvSS9c3cD6CJWzXmw55HaDBOh26b-9-YuGN7uxukSGVO-f73FxCQMrAGCx7RebJej61Tw9Wk08K5D1IDY9_c9bK7zPF0NqEN4f3ekKY7_nw7mJps7Mr2Lbt5IVYuxTBUSUVfftXtLCOAr6CzEev1fOt3vL-kfYNt6SGwLae0L7rz1lzViGxw==/gettyimages-1279899488_wide-f3860ceb0ef19643c335cb34df3fa1de166e2761-s1100-c50.jpg?errorImage=false"
        },
        {
          question: "フラミンゴの羽色は一般的に何色ですか ?",
          options: ["白", "黒", "赤", "青"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyUDCrPhrNzdZk9U7YCd38f9dNvi1xW4kR7-nxAdOg1nxAQW4EihD99t_f6mxjsEKb-bdX40O-r3OUl4gwPP6Y6U0c47W41Pr-GODgxhcX1RdsC0R0Y6v_2R3ICHRZq_FTthXceD5rQeYMqVeNkdPj37g1QH1AtfayjLGUlGdV6IwtaNMHE-PuhXZ0IrYM2LTnD0LZpgjFeQ_3dISoYwu-fiDDPkI2GxVVQBcbGbfi62-rD4NrvCCQMYnjTEaRytnNMDMuE_84lFCfJv3eV8XdPxekkVSLCfzW8WIi7__njJJQMKs-Gs3N1mT1TtgJ3fx_102-LXFbiRHv6fEB06DWfEBBbgSKEP3239_qbGOwQpv5t1fjQ76vc5SXiDA8_pjpTRzjtbjU-v4Y4ODGFxfVF2wLRHRjq__ZHcgIdFmr8VO2Fdx4PmtB5gypV42R0-PfuDVAfUC19rKMsZSUZ1XojC1o0wcT4-6FdnQitgzYtOcPQtmmCMV5D_d0hKhjC75-IMM-QjYbFVVAFxsZt-Lrb6sPg2u8IJAxieNMRpHK2c0wMy4T_ziUUJ8m_d5Xxd04Nk1FqJ9eE0Kz8G6BZUDmg=/sub-buzz-14696-1499150051-4.jpg?errorImage=false"
        },
        {
          question: "犬の鼻は何のために特に優れているとされていますか ?",
          options: ["呼吸のため", " 聴覚のため", "嗅覚のため", "視覚のため"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG9rPgZApaBCJC9fM4dC_sYSGRDzFzrqm3OMb3720emkNpHLoRYOTl4cHxuD7kBZvcmbcjLiUoz5cGiQ96nCVWdFCV9-ziaJfQwcNmPPvdDJt75kZIdDFzPsvmz6T4Q_CYM_4qFXugXiRo3LRLC9AyA7t4DJDTaWdL1vuMU87arGFmJQDDVjTbCUbi8GPPiNbxkPfwBr29qurO3TOmeD1sbZGlcjzNqDDszuzqmqTJRGg0y_KAH28QBFf7jmW2xYQsbseoLoEGR_0CwOmV36zcXs6owAg4cj3PgzlcIHpO021Mt6fDAUCLrQO55udPPOIdw0w9xXz6HNZSuZuCu8iPAWs4JIlVFvpxzvd_lr1eqSP9F1_MHKqDFX9QI5t5E2IOG3iALm3Dj0mBgUjpDk-z2gFtjPqdHI1g2kKWtX-DbxaxYP2EULe3XhNsJyShUAiVQ==/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?errorImage=false"
        },
        {
          question: "どの犬種が通常「警察犬」として知られており、犯罪者の追跡や警備に使用されますか ?",
          options: ["ゴールデン・レトリバー", "ドーベルマン・ピンシャー", "シーズー", "プードル"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG9rPgZApaBCJC9fM4dC_sYSGRDzFzrqm3OMb3720emkNpHLoRYOTl4cHxuD7kBZvcmbcjLiUoz5cGiQ96nCVWdFCV9-ziaJfQwcNmPPvdDJt75kZIdDFzPsvmz6T4Q_CYM_4qFXugXiRo3LRLC9AyA7t4DJDTaWdL1vuMU87arGFmJQDDVjTbCUbi8GPPiNbxkPfwBr29qurO3TOmeD1sbZGlcjzNqDDszuzqmqTJRGg0y_KAH28QBFf7jmW2xYQsbseoLoEGR_0CwOmV36zcXs6owAg4cj3PgzlcIHpO021Mt6fDAUCLrQO55udPPOIdw0w9xXz6HNZSuZuCu8iPAWs4JIlVFvpxzvd_lr1eqSP9F1_MHKqDFX9QI5t5E2IOG3iALm3Dj0mBgUjpDk-z2gFtjPqdHI1g2kKWtX-DbxaxYP2EULe3XhNsJyShUAiVQ==/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?errorImage=false"
        },
        {
          question: "象は哺乳動物ですが、その肌は何で覆われていますか ?",
          options: ["鱗", "羽毛", "毛皮", "皮膚"],
          correctAnswer: 4,
          image: "https://static2.yan.vn/YanNews/2167221/201704/20170429-114326-cute-baby-elephants-7-58fef0353e07c__700_600x419.jpg"
        },
        {
          question: "ゾウ科の中で最も小型の種は何ですか ?",
          options: ["アジアゾウ", "アフリカゾウ", "インドゾウ", "マンモス"],
          correctAnswer: 1,
          image: "https://static2.yan.vn/YanNews/2167221/201704/20170429-114326-cute-baby-elephants-7-58fef0353e07c__700_600x419.jpg"
        },
        {
          question: "クジラの中で最も大きな種類は何ですか ?",
          options: ["シャチ", "グレートホエール", "ゾウノセクジラ", "ドルフィン"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyRY1oktgASFYeEfZyKPpxM2R1OK7DPPtxPG0HcRkQac8xPhvOOa8YokQ0h9FkFsJgU83CvSepIP_ayvljf4PgLQpN2HiIo74CToXmW3-fiFDOEq6K0XH6zU2ZUEtUuZNLV1fb9MNNWqJz2x4LmtaT8bnZ6KOIykd_gBiINKu0Q7RpXI8zagw7M7s6pqkyURoNnF0bcKCXXGQaXUgHFdRO4aOyuGFongc8Hm7mQ6ljIyuVv03SPQEpgWLg4LRwZmZzweSHCrIKQX2ti2m7uyXt3UxpSdHWb5ckCfAr0zdbFNbEiv4_5mcF-EBqSGS_0mJFYgY0zUEJv1Ky4pRJpmkI0Qfian2kBS-3ppAkn8PgdQ/E382AFE382B7E38299E383A9-2.png?errorImage=false"
        },
        {
          question: "クジラは哺乳動物であり、どの特徴によって他の魚と区別されますか ?",
          options: ["鱗", "ひれ", "ひげ", "トランク"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyRY1oktgASFYeEfZyKPpxM2R1OK7DPPtxPG0HcRkQac8xPhvOOa8YokQ0h9FkFsJgU83CvSepIP_ayvljf4PgLQpN2HiIo74CToXmW3-fiFDOEq6K0XH6zU2ZUEtUuZNLV1fb9MNNWqJz2x4LmtaT8bnZ6KOIykd_gBiINKu0Q7RpXI8zagw7M7s6pqkyURoNnF0bcKCXXGQaXUgHFdRO4aOyuGFongc8Hm7mQ6ljIyuVv03SPQEpgWLg4LRwZmZzweSHCrIKQX2ti2m7uyXt3UxpSdHWb5ckCfAr0zdbFNbEiv4_5mcF-EBqSGS_0mJFYgY0zUEJv1Ky4pRJpmkI0Qfian2kBS-3ppAkn8PgdQ/E382AFE382B7E38299E383A9-2.png?errorImage=false"
        },
        {
          question: "ライオンは「ジャングルの王」としても知られていますが、実際にはどの地域に生息していますか ?",
          options: ["アフリカ", "アジア", "アメリカ", " ヨーロッパ"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG2zx9qR5r-kkSTqge2mOJ9PSgJ0cEegqWvE-Np5LGH0A9RxveRTCQBWTnue0EbUy-NHE0b0f5P9Hdj15pqSbVE1TLYh_lM0oiptO8z6qf1N5YC7FYJ00LGAOuL4W2BndMwbKUbc11d3_wFMVnPclS96La0NLpimWxXrSkykDV0dZkAAksGKiLlvjd3mPc6J24XQeaomhIDXCerno71LMTlNkZ74RIJgpOuTCCQ-bEgyvP__iqpwbwhFz5FKWPN2wkg==/lion-805084_1280.jpg?errorImage=false"
        },
        {
          question: "ライオンのオスは通常どの特徴で識別できますか ?",
          options: ["細い体つき", "短いたてがみ", "大きく曲がった角", "眼鏡のような模様"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG2zx9qR5r-kkSTqge2mOJ9PSgJ0cEegqWvE-Np5LGH0A9RxveRTCQBWTnue0EbUy-NHE0b0f5P9Hdj15pqSbVE1TLYh_lM0oiptO8z6qf1N5YC7FYJ00LGAOuL4W2BndMwbKUbc11d3_wFMVnPclS96La0NLpimWxXrSkykDV0dZkAAksGKiLlvjd3mPc6J24XQeaomhIDXCerno71LMTlNkZ74RIJgpOuTCCQ-bEgyvP__iqpwbwhFz5FKWPN2wkg==/lion-805084_1280.jpg?errorImage=false"
        },
        {
          question: "スズメの羽の色は通常何色ですか ?",
          options: ["赤", "青", "黄色", "褐色"],
          correctAnswer: 4,
          image: "https://upload.wikimedia.org/wikipedia/commons/b/b3/Feldsperling.jpg"
        },
        {
          question: "スズメは主に何を食べていますか ?",
          options: ["肉", "草", "昆虫", "果物"],
          correctAnswer: 3,
          image: "https://upload.wikimedia.org/wikipedia/commons/b/b3/Feldsperling.jpg"
        },
        {
          question: "ワシはどのような獲物を捕食することが一般的ですか ?",
          options: ["魚", "果物", "草", "小動物"],
          correctAnswer: 4,
          image: "https://image.ganref.jp/photos/members/tsuguto/8abb642cff4f7ef2c07629358b836566_4.jpg"
        },
        {
          question: "ワシの特徴的な特徴の一つは、何に優れていることですか ?",
          options: ["嗅覚", "視覚", "聴覚", "味覚"],
          correctAnswer: 2,
          image: "https://image.ganref.jp/photos/members/tsuguto/8abb642cff4f7ef2c07629358b836566_4.jpg"
        },
        {
          question: "カラスの羽の色は通常何色ですか ?",
          options: ["黒", "白", "赤", "青"],
          correctAnswer: 1,
          image: "https://booth.pximg.net/c/620x620/29f50d4f-8a51-4ff8-8425-f6e33996851f/i/17647/9b736f77-e342-4b5d-8799-592737a526f7_base_resized.jpg"
        },
        {
          question: "カラスは知性が高いことで有名ですが、どのような知能の証拠がありますか ?",
          options: ["運動能力", "良い記憶力", "優れた聴覚", "速さ"],
          correctAnswer: 2,
          image: "https://booth.pximg.net/c/620x620/29f50d4f-8a51-4ff8-8425-f6e33996851f/i/17647/9b736f77-e342-4b5d-8799-592737a526f7_base_resized.jpg"
        },
        {
          question: "ペンギンの羽は通常何の色ですか ?",
          options: ["白", "黒", "青", "赤"],
          correctAnswer: 2,
          image: "https://i.pinimg.com/originals/36/b7/c3/36b7c35356da6e93a6e88bce14f716eb.jpg"
        },
        {
          question: "ペンギンは陸上で歩行する際、どのような方法で歩きますか ?",
          options: ["二足歩行", "四足歩行", "ハンドスプリング", "スライディング"],
          correctAnswer: 4,
          image: "https://i.pinimg.com/originals/36/b7/c3/36b7c35356da6e93a6e88bce14f716eb.jpg"
        },
        {
          question: "ヘビは何の特徴的な方法で移動しますか ?",
          options: ["歩行", "飛行", "爬虫類は移動しません", "爬虫類は水中を泳ぎます"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG53frtpNH_GPPVEeMYZDpSygcWLUMx8_uagw3GqBuJR1E0vm3lz5CD6OJc8UuhWEnJ6G3ATjSdd0K3MBbyhdT6w2Z5puQxl_ll4Pj-qu2sdIsbEwVVvWuAlY58VJFmTbKQjsXmrKQ3PmXry8i2rq6-fPdbrR4mu9f42xA_isMl1g0cZsbxud_yRxjwbxxMSAMXckwfXl5E3N3FFfrK31L5FS6xUbMGjx3NnGewGSuOeRWCrdKq4ng21LoyFkgIuo8SoF56kBcgZUb_pMJCv4ZG0EuUCsWufom32BovCdr-oSrvcMUxYkEc583pNpCOFyPBv7AtBOk_XBF1Low32orItX6ZP9WFoCKR_P6BNUa8Qj_rHwRD5Or0mzz28D7XuRfciLZbcWiDSPhSQFUj52xWVm_ewCbcIDmygnz7Ecm81ufAZBL_uas_0Ssq2V5CY04HLr0_kowcAO-kGJqQsuBeMggfheT3VZvQQXUlSp7XonEuJFoUMI3nBcW_ra44WiD-pPG0S-7mVCrQKH9CRCELoDqB-q_opiuS7ntt7ENUqNcy_xPW1bS0Q8_-QpRu8uDj5pCfU6AshSiW76gIBHxJbxYUJO6OUoSm50AiNhzdRaAOAAgsP8JCydtYWo1trF1PuyzKKPdEFBoRJnkmT-S83-ek7r57hq1tYec9fUik2w15vdIO1kDhIw5h0QVFhyARyhLzD6HYjQf8ZJdrmwHHYfi1ZZyzb9AtZwCvpiQUIICOAhcXYJ6agCCq2YTHn2mUG35xZRhEscjimFnuIDjzu9zLWKepzr6cQa-M4qS2jKNMlG3c8dVQxn2rATQGxPM2Ik4tlSx4gFNSWkRVQsIqQWvp6gGAfyWO9X-k5Nr2dPkny_ym7BeQZIs5z14Po024ixg9FZiufsmc91x0Vf019TvOfdbfXGbD3WCzT_LSSplQmgjQ2aP6u5HNN5IIypOg==/E5BDBCE38289E381AEE382B9E3838DE383BCE382AF.jpg?errorImage=false"
        },
        {
          question: "ヘビは通常どの方法で獲物を捕食しますか?",
          options: ["足で追いかける", "羽で打つ", "体で絞める", "毒で噛む"],
          correctAnswer: 4,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG53frtpNH_GPPVEeMYZDpSygcWLUMx8_uagw3GqBuJR1E0vm3lz5CD6OJc8UuhWEnJ6G3ATjSdd0K3MBbyhdT6w2Z5puQxl_ll4Pj-qu2sdIsbEwVVvWuAlY58VJFmTbKQjsXmrKQ3PmXry8i2rq6-fPdbrR4mu9f42xA_isMl1g0cZsbxud_yRxjwbxxMSAMXckwfXl5E3N3FFfrK31L5FS6xUbMGjx3NnGewGSuOeRWCrdKq4ng21LoyFkgIuo8SoF56kBcgZUb_pMJCv4ZG0EuUCsWufom32BovCdr-oSrvcMUxYkEc583pNpCOFyPBv7AtBOk_XBF1Low32orItX6ZP9WFoCKR_P6BNUa8Qj_rHwRD5Or0mzz28D7XuRfciLZbcWiDSPhSQFUj52xWVm_ewCbcIDmygnz7Ecm81ufAZBL_uas_0Ssq2V5CY04HLr0_kowcAO-kGJqQsuBeMggfheT3VZvQQXUlSp7XonEuJFoUMI3nBcW_ra44WiD-pPG0S-7mVCrQKH9CRCELoDqB-q_opiuS7ntt7ENUqNcy_xPW1bS0Q8_-QpRu8uDj5pCfU6AshSiW76gIBHxJbxYUJO6OUoSm50AiNhzdRaAOAAgsP8JCydtYWo1trF1PuyzKKPdEFBoRJnkmT-S83-ek7r57hq1tYec9fUik2w15vdIO1kDhIw5h0QVFhyARyhLzD6HYjQf8ZJdrmwHHYfi1ZZyzb9AtZwCvpiQUIICOAhcXYJ6agCCq2YTHn2mUG35xZRhEscjimFnuIDjzu9zLWKepzr6cQa-M4qS2jKNMlG3c8dVQxn2rATQGxPM2Ik4tlSx4gFNSWkRVQsIqQWvp6gGAfyWO9X-k5Nr2dPkny_ym7BeQZIs5z14Po024ixg9FZiufsmc91x0Vf019TvOfdbfXGbD3WCzT_LSSplQmgjQ2aP6u5HNN5IIypOg==/E5BDBCE38289E381AEE382B9E3838DE383BCE382AF.jpg?errorImage=false"
        },
        {
          question: "カメは一般的にどのような特徴で知られていますか ?",
          options: ["長い首", "甲羅を持つ", "羽毛を持つ", "翼を持つ"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG-k-1_c5wXRAf5ccEUdvFsoOw2xaTCw7jfiCqaEsfcvX-uFHfz1b8ql34zFNdwPfdiJjSffXrJaTOcGnefjhqDuCVxmFFdGaTdEaIW01ytZx4XnQbJkJutTVzR-ecLop4PF6SRVIsJ_NbxYiLv_-eMnpPtf3OcF0QH-XHBFHbxbKDsNsWkwsO434gqmhLH3L1_rhR389W_Kpd-MxTXcD33YiY0n316yWkznBp3n44ag7glcZhRXRmk3RGiFtNcrWceF50GyZCbrU1c0fnnC6KeCDZNRaifXhNCs_BugWVA5o/5c636af4240000af02a21e20.jpeg?errorImage=false"
        },
        {
          question: "カメは通常どのような生息地で見られますか?",
          options: ["森林", "水中", "陸地", "砂漠"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG-k-1_c5wXRAf5ccEUdvFsoOw2xaTCw7jfiCqaEsfcvX-uFHfz1b8ql34zFNdwPfdiJjSffXrJaTOcGnefjhqDuCVxmFFdGaTdEaIW01ytZx4XnQbJkJutTVzR-ecLop4PF6SRVIsJ_NbxYiLv_-eMnpPtf3OcF0QH-XHBFHbxbKDsNsWkwsO434gqmhLH3L1_rhR389W_Kpd-MxTXcD33YiY0n316yWkznBp3n44ag7glcZhRXRmk3RGiFtNcrWceF50GyZCbrU1c0fnnC6KeCDZNRaifXhNCs_BugWVA5o/5c636af4240000af02a21e20.jpeg?errorImage=false"
        },
        {
          question: "ワニは一般的にどの地域に生息していますか ?",
          options: ["北極", "南極", "アフリカ", "アジア"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG1Nx7_9d54XPr3OLy1eQjEXqreBganhUFefEmHK1y5tivGWWt7LN38ydfZOTBqyC-KceLuXybFs8YqL37Cv3Bt2Mubx8tnrAcObtg2Np22d9IC7eU5C3bhLKUw61WNBl9VP0hhOKE0WV02xp8COfSD-vtlPRmd6kxsTBdIZpnw2q7bTZL3Ja6R149uhTg-I-JXQuvACiH_mOahZTIxo5vsKJ0s3TAosxasNSWycAJGsAJgVf4Bnl2VWbNZYVovr8L6QhXk8bL2UcryEVpdGQB8nLJaIHhi0xYRaF1cudvqhR/230617web_fid02-thumb-1200x800-746235.jpg?errorImage=false"
        },
        {
          question: "ワニの特徴的な特徴は何ですか?",
          options: ["長い首", "鳴き声", "羽毛", " 硬い鱗"],
          correctAnswer: 4,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG1Nx7_9d54XPr3OLy1eQjEXqreBganhUFefEmHK1y5tivGWWt7LN38ydfZOTBqyC-KceLuXybFs8YqL37Cv3Bt2Mubx8tnrAcObtg2Np22d9IC7eU5C3bhLKUw61WNBl9VP0hhOKE0WV02xp8COfSD-vtlPRmd6kxsTBdIZpnw2q7bTZL3Ja6R149uhTg-I-JXQuvACiH_mOahZTIxo5vsKJ0s3TAosxasNSWycAJGsAJgVf4Bnl2VWbNZYVovr8L6QhXk8bL2UcryEVpdGQB8nLJaIHhi0xYRaF1cudvqhR/230617web_fid02-thumb-1200x800-746235.jpg?errorImage=false"
        },
        {
          question: "カメレオンの最も特徴的な能力は何ですか ?",
          options: [" 超音速の走行", "色を変えること", "高速な飛行", "地下で掘る能力"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGylEo1Lzh_aVJGGP_GZIl0cO1IaYhzS2CaznPxTLw_cdD_nsWftuFF_fAP17pbTI2H9WqJkp9OCUVAIgpOsZKMWny_ofmd68sZybUguZ6NjrFXCC3IzZiJ7jXApEthcJTH82HeZuxzjPDNI5H7KitQItTgUEYZxjKjVPtbzVPTNi4-J2vl5DkTBOUtnUW5BkeEaODq6E-v2UMzfZsXJUJ6_B3wMURLhSWauHADQ9O8XhcKaC-q5Qp4R6Xd5KSfRrE5QG3iwXK0p6WTb1IIhtTdjk3PjdKuPP1oBrDU6ah2JcLwAXaR22cLMps99R7eRed3Uxj4BHLyVcMiWaeqjJul3XuZXLhkyvnSvw1Bui1-mFXHtm6F22oewD9YYQLICk8eYd0MC0ZJ6NEELhybSszBoIc52AMZBIA2e9TCpPZSExCnX6n7DnquvVdFy3UA5yqQajXlB87e0xucdWQJxLBdnr67ezHKe1nVscwGzUkJp_cELQyJ_TnXygPDZy1a2CFupgXgKKs4aR9LaKgnWXrsPjwoL9R4kH0_TFncjXSOn--gVZJgHxK8GO-gFHFUu0ffSOfaLHFEjdF8Ps82rPKp_LSedCmz4J_-pWaCBkPYk1PIIPWXXC5L7AfFpoD03Y3g==/E382A8E3839CE382B7E382ABE383A1E383ACE382AAE383B3-1-scaled-760x460.jpg?errorImage=false"
        },
        {
          question: "カメレオンは主に何を食べていますか?",
          options: ["草", "昆虫", "魚", "果物"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGylEo1Lzh_aVJGGP_GZIl0cO1IaYhzS2CaznPxTLw_cdD_nsWftuFF_fAP17pbTI2H9WqJkp9OCUVAIgpOsZKMWny_ofmd68sZybUguZ6NjrFXCC3IzZiJ7jXApEthcJTH82HeZuxzjPDNI5H7KitQItTgUEYZxjKjVPtbzVPTNi4-J2vl5DkTBOUtnUW5BkeEaODq6E-v2UMzfZsXJUJ6_B3wMURLhSWauHADQ9O8XhcKaC-q5Qp4R6Xd5KSfRrE5QG3iwXK0p6WTb1IIhtTdjk3PjdKuPP1oBrDU6ah2JcLwAXaR22cLMps99R7eRed3Uxj4BHLyVcMiWaeqjJul3XuZXLhkyvnSvw1Bui1-mFXHtm6F22oewD9YYQLICk8eYd0MC0ZJ6NEELhybSszBoIc52AMZBIA2e9TCpPZSExCnX6n7DnquvVdFy3UA5yqQajXlB87e0xucdWQJxLBdnr67ezHKe1nVscwGzUkJp_cELQyJ_TnXygPDZy1a2CFupgXgKKs4aR9LaKgnWXrsPjwoL9R4kH0_TFncjXSOn--gVZJgHxK8GO-gFHFUu0ffSOfaLHFEjdF8Ps82rPKp_LSedCmz4J_-pWaCBkPYk1PIIPWXXC5L7AfFpoD03Y3g==/E382A8E3839CE382B7E382ABE383A1E383ACE382AAE383B3-1-scaled-760x460.jpg?errorImage=false"
        },
        {
          question: "トカゲはどの特徴的な方法で温度を調整しますか ?",
          options: ["汗をかく", "肺を膨張させる", "外部の熱源を利用する", "冷たい水で泳ぐ"],
          correctAnswer: 3,
          image: "https://img.freepik.com/premium-photo/bronchocela-cristatella-also-known-as-the-green-crested-lizard-generative-ai_972272-423.jpg"
        },
        {
          question: "以下のトカゲは非常に毒性が高く、どの大陸に生息していますか?",
          options: ["コブラ", "イグアナ", "グリーントゥアーゲーター", "ゴビドラゴン"],
          correctAnswer: 3,
          image: "https://img.freepik.com/premium-photo/bronchocela-cristatella-also-known-as-the-green-crested-lizard-generative-ai_972272-423.jpg"
        },
        {
          question: "サケの生涯の旅において、どの特徴的な出来事が起こりますか ?",
          options: ["冬眠", "産卵", "ハイバネーション", "人工授精"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG6R-Scnb-VjnNp64Wzfkxuf5VXxyPXjEgPibv-PV-sbixbUc3tQ5kvFT9X8b2Did0CCB-F5PdVm9BBdSVKnteifixbbI2rx3NKnm587CtKe9SgYvlp8b4pADhhUnK0V0U2Y-cI0YFP2EaQjAVcixPow=/745_1.jpg?errorImage=false"
        },
        {
          question: "サケの種類において、特に有名な一つは何ですか?",
          options: ["オオサケ", "シロサケ", "コイ", "ウナギ"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG6R-Scnb-VjnNp64Wzfkxuf5VXxyPXjEgPibv-PV-sbixbUc3tQ5kvFT9X8b2Did0CCB-F5PdVm9BBdSVKnteifixbbI2rx3NKnm587CtKe9SgYvlp8b4pADhhUnK0V0U2Y-cI0YFP2EaQjAVcixPow=/745_1.jpg?errorImage=false"
        },
        {
          question: "マグロは一般的にどのような食物を摂取しますか ?",
          options: ["植物", "昆虫", "小魚や甲殻類", "草食"],
          correctAnswer: 3,
          image: "https://dic.nicovideo.jp/oekaki/653114.png"
        },
        {
          question: "マグロはどの特徴的な特性を持つことで知られていますか?",
          options: ["透明な体", "群れで泳ぐ", "草を食べる", "高速な泳ぎ"],
          correctAnswer: 4,
          image: "https://dic.nicovideo.jp/oekaki/653114.png"
        },
        {
          question: "クマノミは通常どのような色をしていますか ?",
          options: ["青", "赤と白", "黒と黄色", "緑"],
          correctAnswer: 2,
          image: "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Amphiprion_ocellaris_%28Clown_anemonefish%29_by_Nick_Hobgood.jpg/1200px-Amphiprion_ocellaris_%28Clown_anemonefish%29_by_Nick_Hobgood.jpg"
        },
        {
          question: "クマノミは通常どの種類の水域で見られますか?",
          options: ["塩水", "淡水", "河川", "湖"],
          correctAnswer: 1,
          image: "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Amphiprion_ocellaris_%28Clown_anemonefish%29_by_Nick_Hobgood.jpg/1200px-Amphiprion_ocellaris_%28Clown_anemonefish%29_by_Nick_Hobgood.jpg"
        },
        {
          question: "フグの最も特徴的な防衛機構は何ですか ?",
          options: ["毒針を持つ", "噛みつく", "逃げる", "色を変える"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyJ2hCF459ulUB1Zdm7P59xvTs9uxFyxh8cA8KqzGaVs3IJrvQVpxmpz85NEp_taXJMCV-Vvo63K9lSo6kU7jYHts0rxzg09jhksrpulho-PIIH4Xk91Wb0EF1JUqe16J6EbDtE3kSTHQAfNpcKkWOygxYzNQMJmzpcmrsgmq0edQUna3E6XkFzZtWOf7izBuk3mJH7bnSEWFPsgew2BOIpRU5ygs6_kfIrUKuMI9HFe/20160624_fuguballoon.jpg?errorImage=false"
        },
        {
          question: "フグはどの部分が特に毒を持つことがありますか?",
          options: ["鱼の鱼肉", "骨", "血液", "皮膚"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyJ2hCF459ulUB1Zdm7P59xvTs9uxFyxh8cA8KqzGaVs3IJrvQVpxmpz85NEp_taXJMCV-Vvo63K9lSo6kU7jYHts0rxzg09jhksrpulho-PIIH4Xk91Wb0EF1JUqe16J6EbDtE3kSTHQAfNpcKkWOygxYzNQMJmzpcmrsgmq0edQUna3E6XkFzZtWOf7izBuk3mJH7bnSEWFPsgew2BOIpRU5ygs6_kfIrUKuMI9HFe/20160624_fuguballoon.jpg?errorImage=false"
        },
        {
          question: "サバは一般的にどのような料理に使用されますか ?",
          options: ["寿司", "ピザ", "パスタ", "チョコレート"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG15w5qViOaqU_RuSXNJkE91msylFMpcn1-5fDp0cKV86NgbA0sEhaxqUkOO1JEV04Ojm_9epGaaoeVeeXZ2Zvgarj72WeAx40UoFjNJ7uv1yiFPsUO1u_Njk2w8xSWCWXCPBmx0MwK-5InfWwxzu6zPn715rITM9qe9ZwrjT8MhDj6gzNiX_25inso8fud56VflGMjObvW1fai6cuCLBpRGEIwwBFPXRcHYaVPvfo0OQ/masaba.jpg?errorImage=false"
        },
        {
          question: "サバは栄養価が豊富で、どの栄養素が豊富に含まれていますか?",
          options: ["ビタミン C", "カルシウム", "オメガ-3脂肪酸", "鉄"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG15w5qViOaqU_RuSXNJkE91msylFMpcn1-5fDp0cKV86NgbA0sEhaxqUkOO1JEV04Ojm_9epGaaoeVeeXZ2Zvgarj72WeAx40UoFjNJ7uv1yiFPsUO1u_Njk2w8xSWCWXCPBmx0MwK-5InfWwxzu6zPn715rITM9qe9ZwrjT8MhDj6gzNiX_25inso8fud56VflGMjObvW1fai6cuCLBpRGEIwwBFPXRcHYaVPvfo0OQ/masaba.jpg?errorImage=false"
        },
        {
          question: "バッタは通常どのような食物を摂取しますか ?",
          options: ["肉", "葉っぱ", "魚", "果物"],
          correctAnswer: 2,
          image: "https://d2tzd06cwmvahj.cloudfront.net/wp-content/uploads/2022/01/11125404/batta-01-min.jpeg"
        },
        {
          question: "バッタはどのような音を通じてコミュニケーションを取りますか?",
          options: ["鳴き声", "歌声", "笛", "音楽ぎ"],
          correctAnswer: 1,
          image: "https://d2tzd06cwmvahj.cloudfront.net/wp-content/uploads/2022/01/11125404/batta-01-min.jpeg"
        },
        {
          question: "ハチの巣は通常どのような材料で作られていますか?",
          options: ["木", "紙", "金属", "石"],
          correctAnswer: 2,
          image: "https://www.yomiuri.co.jp/media/2023/10/20231019-OYT1I50058-1.jpg?type=large"
        },
        {
          question: "ハチはどのような方法でコミュニケーションをとりますか?",
          options: ["踊る", "鳴き声", "サイン言語", "メール"],
          correctAnswer: 1,
          image: "https://www.yomiuri.co.jp/media/2023/10/20231019-OYT1I50058-1.jpg?type=large"
        },
        {
          question: "クモの特徴的な特性の一つは何ですか ?",
          options: ["飛行能力", "巣を編む", "甲殻を持つ", "羽毛を持つ"],
          correctAnswer: 2,
          image: "https://img.gamewith.jp/article_tools/atsumori/gacha/musi_78.png"
        },
        {
          question: "クモの巣を作るために使用される糸は通常何で作られていますか?",
          options: ["金", "木", "絹", "バミューダトライアングル"],
          correctAnswer: 3,
          image: "https://img.gamewith.jp/article_tools/atsumori/gacha/musi_78.png"
        },
        {
          question: "アリの社会的な生活様式は何ですか ?",
          options: ["単独生活", "家族単位で生活", "群れで生活", "仲間と一緒に旅をする"],
          correctAnswer: 3,
          image: "https://bunshun.jp/mwimgs/9/1/1200wm/img_91c3dd55f6f5eefaf0139210f7af6e75416334.jpg"
        },
        {
          question: "アリは通常どのような食物を摂取しますか?",
          options: ["肉", "葉っぱ", "昆虫", "花の蜜"],
          correctAnswer: 4,
          image: "https://bunshun.jp/mwimgs/9/1/1200wm/img_91c3dd55f6f5eefaf0139210f7af6e75416334.jpg"
        },
        {
          question: "カブトムシは通常どのような特徴的な特性を持っていますか ?",
          options: ["長い角", "羽を持つ", "花粉を集める", "毛皮を持つ"],
          correctAnswer: 1,
          image: "https://enjoyholiday.site/wp-content/uploads/2021/03/kabu-noko.jpg"
        },
        {
          question: "カブトムシの角は通常どのような目的で使用されますか?",
          options: ["飛行", "攻撃と防御", "鳴き声を出す", "水中で泳ぐ"],
          correctAnswer: 2,
          image: "https://enjoyholiday.site/wp-content/uploads/2021/03/kabu-noko.jpg"
        },
        {
          question: "フクロウはどのようにして夜間に獲物を見つけるのですか?",
          options: ["超音波を発射する", "赤外線ビジョンを使用する", "非常に鋭い嗅覚を持つ", "瞳孔を広げる"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGwThSGv0SuOP4KUrWMZ3M-4hSpdWI1ihFx5y2jEKZb6LTx1GTPmbVP5nWGU31u1SfVA4gVElcBvNu0Xsxoz16SspiZuoXljTbQsJ9Tu3Yx_VYdHmxKvCbQc8Nqh0cPLir_F6SRVIsJ_NbxYiLv_-eMkE4Uhr9Erjj-ClK1jGdzPuIUqXViNYoRcectoxCmW-i08dRkz5m1T-Z1hlN9btUn1QOIFRJXAbzbtF7MaM9ekrKYmbqF5Y020LCfU7t2Mf1WHR5sSrwm0HPDaodHDy4q-DZNRaifXhNCs_BugWVA5o/839AFC65-AE36-4A66-91F0-A935C14921D2.jpeg?errorImage=false"
        },
        {
          question: "フクロウは主に何を食べる動物ですか?",
          options: ["魚", "果物", "昆虫", "小型哺乳動物"],
          correctAnswer: 4,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGwThSGv0SuOP4KUrWMZ3M-4hSpdWI1ihFx5y2jEKZb6LTx1GTPmbVP5nWGU31u1SfVA4gVElcBvNu0Xsxoz16SspiZuoXljTbQsJ9Tu3Yx_VYdHmxKvCbQc8Nqh0cPLir_F6SRVIsJ_NbxYiLv_-eMkE4Uhr9Erjj-ClK1jGdzPuIUqXViNYoRcectoxCmW-i08dRkz5m1T-Z1hlN9btUn1QOIFRJXAbzbtF7MaM9ekrKYmbqF5Y020LCfU7t2Mf1WHR5sSrwm0HPDaodHDy4q-DZNRaifXhNCs_BugWVA5o/839AFC65-AE36-4A66-91F0-A935C14921D2.jpeg?errorImage=false"
        },
        {
          question: "ハリネズミの背中にある何のための特徴的な防御機構ですか?",
          options: ["トゲ", "羽毛", "キノコ", "美しい模様"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyXNmGcpOzki0LVhOcNf5bLmiSe4Fwac4icHuD84C49PddtrnLBqUTDFx2qpz8tm0J4kygo9q0oWs7WvND9DORkzb_alaKZoSWT12ArWLFppIWSkJSDzguORv1ywXsM52ezPMJtkQ1PNr5iBTdT7-EVe7L6JjFWtDtv5gUSQ5DImHnQ3_6GTE5AyDiovZJ9RuA_57Fn7bhRf3wD9e6W0yNgkjE_Tv8dX5L5JJAytV23YA3avS2D7qYv8IAdw2RYqSxi_jb_NzcsxpE2uC-2X9M6EIwwBFPXRcHYaVPvfo0OQ/hedgehog_main.jpg?errorImage=false"
        },
        {
          question: "ハリネズミはどのような状況で自身の体を丸めますか?",
          options: ["睡眠時", "脅威を感じたとき", "飛び跳ねて楽しい時", "鳴き声を出すとき"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyXNmGcpOzki0LVhOcNf5bLmiSe4Fwac4icHuD84C49PddtrnLBqUTDFx2qpz8tm0J4kygo9q0oWs7WvND9DORkzb_alaKZoSWT12ArWLFppIWSkJSDzguORv1ywXsM52ezPMJtkQ1PNr5iBTdT7-EVe7L6JjFWtDtv5gUSQ5DImHnQ3_6GTE5AyDiovZJ9RuA_57Fn7bhRf3wD9e6W0yNgkjE_Tv8dX5L5JJAytV23YA3avS2D7qYv8IAdw2RYqSxi_jb_NzcsxpE2uC-2X9M6EIwwBFPXRcHYaVPvfo0OQ/hedgehog_main.jpg?errorImage=false"
        },
        {
          question: "コウモリは通常、何を食べますか?",
          options: ["果物", "昆虫", "草", "魚"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG8yx9t_4WmF0FHuQhkoZuRy5ffs2ZHfnDPd90nQanz3UraMqYoK4zJFnijm8crpUP5tsL9TDkMpthUCPfT4Sh_lptNnEh2hixgFXDHiUDaWX7haR4jHNKMDtb_0tLhvxB4qNCoyUsiYiHTDmQlq0nYjs6eFZpCDtTRL7qMz2jIfFiGqkVK8cipc4plxnYX0KZAzP1FfB1eQGo-YMBwUGf6jhnq2P9FAPNR5Ejch-NbTB/23__AdobeStock_291224114.jpeg?errorImage=false"
        },
        {
          question: "コウモリは夜行性ですが、主に何を使って障害物や獲物を感知しますか?",
          options: ["超音波", "赤外線ビジョン", "レーザー光線", "X線視覚"],
          correctAnswer: 1,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG8yx9t_4WmF0FHuQhkoZuRy5ffs2ZHfnDPd90nQanz3UraMqYoK4zJFnijm8crpUP5tsL9TDkMpthUCPfT4Sh_lptNnEh2hixgFXDHiUDaWX7haR4jHNKMDtb_0tLhvxB4qNCoyUsiYiHTDmQlq0nYjs6eFZpCDtTRL7qMz2jIfFiGqkVK8cipc4plxnYX0KZAzP1FfB1eQGo-YMBwUGf6jhnq2P9FAPNR5Ejch-NbTB/23__AdobeStock_291224114.jpeg?errorImage=false"
        },
        {
          question: "レミングは一般的にどの地域に生息していますか?",
          options: ["熱帯雨林", "極寒の北極圏", "砂漠", "森林"],
          correctAnswer: 2,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyidHiDsqYzS1Gg8vIj4JOEirb0_3RVXkxhkQZosVJAw3BxNXFGqE4Rl4rjtSQUI1uObOVj1_K9L4a3BJOKrIlqWtTxvD-SDy4I5UZP6Qvf2W8hQIU-k-TN1Vt84p37WOTPTBW_ptWzOaXxWRS8jMXcdfcdQ9T1FZLlP-hq3i2n0YlXpEvCcB9LZBs6LRuDdB7cZzirQ8TzSvIFLDDIyM9fvbgXyoUPMzQx_2YZ2chU1AgfPZGA3Q-18J4BbDNZNpw==/4901607282_386780516a_z.jpg?errorImage=false"
        },
        {
          question: "レミングはどのような季節に大量発生を起こすことがありますか?",
          options: ["春", "夏", "秋", "冬"],
          correctAnswer: 4,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyidHiDsqYzS1Gg8vIj4JOEirb0_3RVXkxhkQZosVJAw3BxNXFGqE4Rl4rjtSQUI1uObOVj1_K9L4a3BJOKrIlqWtTxvD-SDy4I5UZP6Qvf2W8hQIU-k-TN1Vt84p37WOTPTBW_ptWzOaXxWRS8jMXcdfcdQ9T1FZLlP-hq3i2n0YlXpEvCcB9LZBs6LRuDdB7cZzirQ8TzSvIFLDDIyM9fvbgXyoUPMzQx_2YZ2chU1AgfPZGA3Q-18J4BbDNZNpw==/4901607282_386780516a_z.jpg?errorImage=false"
        },
        {
          question: "オカピはどの国の象徴的な動物ですか?",
          options: ["ケニア", "ルワンダ", "ウガンダ", "タンザニア"],
          correctAnswer: 3,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyb7UJVlC3Vsg84n4PE2f4Sh2BVtSe21LHSsYkSnDo2IqCFgeMaOdFwNpIfbnxrNNyvGAt0j02MdLXd0vU_GpjbZRGBCw4ke_7Mu2pULfMmwgxc8L1gWRNZ0Bk_-I-I7VL8t7WCgOnzvaxZJsC_msBRgmFP0BjCBwQRAG47dd5EBELvx3FC7b3Ht-rkmsX8sOSAT3jtH4E5ZQWm9p_UupeHlv1Qb5yFwZwcmdqDFxvDdDtrqB8BqEYwifX31Nf3kQs4ApUnAdZsFBOheov3gRJ2-e6a23WCJ_6KoJRDN6kzJ/y1904zoo.jpg?errorImage=false"
        },
        {
          question: "オカピは一般的に何色の体をしていますか?",
          options: ["茶色", "白", "灰色", "斑点模様"],
          correctAnswer: 4,
          image: "https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqGyb7UJVlC3Vsg84n4PE2f4Sh2BVtSe21LHSsYkSnDo2IqCFgeMaOdFwNpIfbnxrNNyvGAt0j02MdLXd0vU_GpjbZRGBCw4ke_7Mu2pULfMmwgxc8L1gWRNZ0Bk_-I-I7VL8t7WCgOnzvaxZJsC_msBRgmFP0BjCBwQRAG47dd5EBELvx3FC7b3Ht-rkmsX8sOSAT3jtH4E5ZQWm9p_UupeHlv1Qb5yFwZwcmdqDFxvDdDtrqB8BqEYwifX31Nf3kQs4ApUnAdZsFBOheov3gRJ2-e6a23WCJ_6KoJRDN6kzJ/y1904zoo.jpg?errorImage=false"
        },
      ];

      let currentQuestionIndex = 0;
      let score = 0;

      function shuffleArray(array) {
        for (let i = array.length - 1; i > 0; i--) {
          const j = Math.floor(Math.random() * (i + 1));
          [array[i], array[j]] = [array[j], array[i]];
        }
      }

      function startGame() {
        shuffleArray(questions);
        currentQuestionIndex = 0;
        currentQuestionIndex = 0;
		  correctAnswers = 0;
		  wrongAnswers = 0;
        score = 0;
        nextQuestion();
      }

      function nextQuestion() {
        if (currentQuestionIndex < 10) {
          // Tampilkan pertanyaan berikutnya
          const question = questions[currentQuestionIndex];
          document.getElementById("question").textContent = question.question;
          document.getElementById("questionImage").src = question.image; // Atur gambar pertanyaan
          const options = question.options;
          for (let i = 0; i < options.length; i++) {
            document.getElementById("option" + (i + 1)).textContent = options[i];
          }
          document.getElementById("result").textContent = "";
          document.getElementById("next").style.display = "none";
        } else {
          // Semua pertanyaan telah dijawab
          document.getElementById("question").textContent = "クイズ終了!";
          document.getElementById("options").style.display = "none";
          document.getElementById("result").textContent = "あなたのスコア: 10 から" + correctAnswers + " 点";
          document.getElementById("next").style.display = "none";
          document.getElementById("finish").style.display = "block"; // Tampilkan tombol Finish
          if (correctAnswers >= wrongAnswers) {
            document.getElementById("closeButton").style.display = "block"; // Tampilkan tombol Close
            countdown(points);
          }
        }
      }

      let correctAnswers = 0;
      let wrongAnswers = 0;
      let points = 0;
      let redirectToPage = false; // Tambahkan variabel ini

      function checkAnswer(selectedOption) {
        const question = questions[currentQuestionIndex];
        if (selectedOption === question.correctAnswer) {
          correctAnswers++;
          points += 20;
          document.getElementById("result").textContent = "正解!";
        } else {
          wrongAnswers++;
          
          document.getElementById("result").textContent = "不正解";
        }
        document.getElementById("next").style.display = "block";
        currentQuestionIndex++;
      }

      function endGame() {
        document.getElementById("question").textContent = "クイズ終了!";
        document.getElementById("options").style.display = "none";
        document.getElementById("result").textContent = "あなたのスコア: " + correctAnswers + " 正解, " + wrongAnswers + " 不正解.  " + points +  "点";

        if (correctAnswers <= wrongAnswers) {
          // Set variabel redirectToPage menjadi true jika lebih sedikit jawaban yang benar
          redirectToPage = true;
        }

        if (wrongAnswers > correctAnswers) {
          document.getElementById("newButton").style.display = "block"; // Menampilkan tombol New Button
        }
      }

      function goToAnotherPage() {
        // Mengarahkan ke halaman lain saat tombol "New Button" ditekan
        window.location.href = "TypeListController";
      }
      
      function goToAnotherPage() {
        // Mengarahkan ke halaman lain saat tombol "New Button" ditekan
        window.location.href = "TypeListController";
      }
      
      stopTimer = true;
      startGame();

      window.onload = function () {
        document.getElementById("openModalButton").click();
      };

      //===================================
//      $(document).ready(function () {
//        // Fungsi untuk memilih tindakan komputer secara acak
//        function pilihTindakanKomputer() {
//          const tindakan = ["グー", "チョキ", "パー"];
//          return tindakan[Math.floor(Math.random() * tindakan.length)];
//        }
//
//        // Fungsi untuk menentukan pemenang
//        let countLose = 2;
//        let countWin = 0;
//        let num = 0;
//        function tentukanPemenang(pilihanPemain, pilihanKomputer) {
//          if (pilihanPemain === pilihanKomputer) {
//            return "draw!";
//          } else if ((pilihanPemain === "グー" && pilihanKomputer === "チョキ") || (pilihanPemain === "チョキ" && pilihanKomputer === "パー") || (pilihanPemain === "パー" && pilihanKomputer === "グー")) {
//            countWin++;
//            if (countWin >= 2) {
//              countWin -= countWin;
//              setTimeout(function () {
//                num += 45;
//                countdown(num);
//                num -= num;
//                $("#close").show();
//              }, 500);
//            }
//            return "勝った!";
//          } else {
//            countLose--;
//            if (countLose <= 0) {
//				countLose += 2;
//              $("#back").show(); // Tampilkan tombol 'Back' saat 'countLose' mencapai 0
//            }
//           
//            return "負けた!";
//          }
//        }
//
//        // Munculkan modal secara otomatis saat halaman dimuat
//        // $("#gameModal").modal("show");
//
//        // Event handler saat tombol dipilih
//         $("#close").click(function () {
//          $("#gameModal").modal("hide"); // Menyembunyikan modal
//        });
//        
//        // Event handler saat tombol "Back" ditekan
//	        $("#newButton").click(function () {
//          window.location.href = "TypeListController";
//        });
//        
//        $(".btn").click(function () {
//          const pilihanPemain = $(this).attr("id");
//          const pilihanKomputer = pilihTindakanKomputer();
//          const hasil = tentukanPemenang(pilihanPemain, pilihanKomputer);
//          $(".result").text(`あなたは ${pilihanPemain} を選んだ, コンピューターは ${pilihanKomputer} を選んだ. 結果は: ${hasil}`);
//        });
//      });

      

      //   timer
      const timerSpan = document.querySelector("#timer");

      const random = Math.random();

      function countdown(second) {
        const timerInterval = setInterval(function () {
          if (second >= 0) {
            timerSpan.innerHTML = second--;
          } else {
			  if (second < 0 ) {
				  clearInterval(timerInterval);
				  $("#restartModal").modal("show");
				  // Set ulang variabel-variabel permainan
			        currentQuestionIndex = 0;
			        points = 0;
			        correctAnswers = 0;
			        wrongAnswers = 0;
			        
//             $("#quizModal").modal("show"); // Menampilkan kembali modal permainan
////              $("#close").hide();
////              $("#back").hide();
//			        // Membuat ulang pertanyaan dengan urutan yang diacak
//			        shuffleArray(questions);
//			
//			        // Memulai permainan dari pertanyaan pertama
//			        nextQuestion();
//			        
//			         startGame();

            }
            
          }
        }, 1000);
      }

      