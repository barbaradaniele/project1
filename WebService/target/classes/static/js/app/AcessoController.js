'use strict';

angular.module('acessoApp').controller('AcessoControllerRest',
    ['AcessoService', '$scope',  function( AcessoService, $scope) {

        var self = this;
        self.acesso = {};
        self.acessos=[];

        self.submit = submit;
        self.getAllAcessos = getAllAcessos;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function getAllAcessos(){
            return AcessoService.getAllAcessos();
        }
    }


    ]);