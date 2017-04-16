'use strict';

angular.module('crudApp').controller('AcessoControllerRest',
    ['AcessoService', '$scope',  function( AcessoService, $scope) {

        var self = this;
        self.user = {};
        self.users=[];

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